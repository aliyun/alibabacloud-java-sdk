// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyRemoteADBDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRemoteADBDataSourceResponseBody body;

    public static ModifyRemoteADBDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRemoteADBDataSourceResponse self = new ModifyRemoteADBDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRemoteADBDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRemoteADBDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRemoteADBDataSourceResponse setBody(ModifyRemoteADBDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRemoteADBDataSourceResponseBody getBody() {
        return this.body;
    }

}
