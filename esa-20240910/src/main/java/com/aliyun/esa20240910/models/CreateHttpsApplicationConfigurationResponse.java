// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpsApplicationConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHttpsApplicationConfigurationResponseBody body;

    public static CreateHttpsApplicationConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpsApplicationConfigurationResponse self = new CreateHttpsApplicationConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateHttpsApplicationConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHttpsApplicationConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHttpsApplicationConfigurationResponse setBody(CreateHttpsApplicationConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHttpsApplicationConfigurationResponseBody getBody() {
        return this.body;
    }

}
