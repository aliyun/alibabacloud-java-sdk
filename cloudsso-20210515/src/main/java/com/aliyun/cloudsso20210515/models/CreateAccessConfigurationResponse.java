// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAccessConfigurationResponseBody body;

    public static CreateAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessConfigurationResponse self = new CreateAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccessConfigurationResponse setBody(CreateAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
