// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AttachAssetGroupToInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachAssetGroupToInstanceResponseBody body;

    public static AttachAssetGroupToInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachAssetGroupToInstanceResponse self = new AttachAssetGroupToInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AttachAssetGroupToInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachAssetGroupToInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachAssetGroupToInstanceResponse setBody(AttachAssetGroupToInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachAssetGroupToInstanceResponseBody getBody() {
        return this.body;
    }

}
