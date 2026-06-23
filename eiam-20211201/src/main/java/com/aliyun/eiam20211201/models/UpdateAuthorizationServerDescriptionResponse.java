// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationServerDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuthorizationServerDescriptionResponseBody body;

    public static UpdateAuthorizationServerDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationServerDescriptionResponse self = new UpdateAuthorizationServerDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationServerDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthorizationServerDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthorizationServerDescriptionResponse setBody(UpdateAuthorizationServerDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthorizationServerDescriptionResponseBody getBody() {
        return this.body;
    }

}
