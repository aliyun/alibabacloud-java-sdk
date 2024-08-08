// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class CreateAccountFactoryBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAccountFactoryBaselineResponseBody body;

    public static CreateAccountFactoryBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountFactoryBaselineResponse self = new CreateAccountFactoryBaselineResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccountFactoryBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccountFactoryBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccountFactoryBaselineResponse setBody(CreateAccountFactoryBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccountFactoryBaselineResponseBody getBody() {
        return this.body;
    }

}
