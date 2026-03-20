// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceInstanceTokenResponseBody body;

    public static CreateServiceInstanceTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceTokenResponse self = new CreateServiceInstanceTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceInstanceTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceInstanceTokenResponse setBody(CreateServiceInstanceTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceInstanceTokenResponseBody getBody() {
        return this.body;
    }

}
