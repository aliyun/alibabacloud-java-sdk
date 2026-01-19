// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateResourceServerScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResourceServerScopeResponseBody body;

    public static CreateResourceServerScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceServerScopeResponse self = new CreateResourceServerScopeResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceServerScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceServerScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceServerScopeResponse setBody(CreateResourceServerScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceServerScopeResponseBody getBody() {
        return this.body;
    }

}
