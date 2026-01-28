// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateAuthorizationResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAuthorizationResourceResponseBody body;

    public static CreateAuthorizationResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationResourceResponse self = new CreateAuthorizationResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuthorizationResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAuthorizationResourceResponse setBody(CreateAuthorizationResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuthorizationResourceResponseBody getBody() {
        return this.body;
    }

}
