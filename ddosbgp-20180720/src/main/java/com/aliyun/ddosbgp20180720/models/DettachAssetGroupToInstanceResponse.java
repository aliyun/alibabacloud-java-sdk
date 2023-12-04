// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DettachAssetGroupToInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DettachAssetGroupToInstanceResponseBody body;

    public static DettachAssetGroupToInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DettachAssetGroupToInstanceResponse self = new DettachAssetGroupToInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DettachAssetGroupToInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DettachAssetGroupToInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DettachAssetGroupToInstanceResponse setBody(DettachAssetGroupToInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DettachAssetGroupToInstanceResponseBody getBody() {
        return this.body;
    }

}
