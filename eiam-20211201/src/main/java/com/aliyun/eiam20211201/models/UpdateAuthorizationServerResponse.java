// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuthorizationServerResponseBody body;

    public static UpdateAuthorizationServerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationServerResponse self = new UpdateAuthorizationServerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthorizationServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthorizationServerResponse setBody(UpdateAuthorizationServerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthorizationServerResponseBody getBody() {
        return this.body;
    }

}
