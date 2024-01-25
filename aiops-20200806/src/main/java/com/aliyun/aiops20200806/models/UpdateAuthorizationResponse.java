// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuthorizationResponseBody body;

    public static UpdateAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationResponse self = new UpdateAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthorizationResponse setBody(UpdateAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthorizationResponseBody getBody() {
        return this.body;
    }

}
