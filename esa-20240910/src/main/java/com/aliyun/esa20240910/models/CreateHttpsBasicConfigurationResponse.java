// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpsBasicConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHttpsBasicConfigurationResponseBody body;

    public static CreateHttpsBasicConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpsBasicConfigurationResponse self = new CreateHttpsBasicConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateHttpsBasicConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHttpsBasicConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHttpsBasicConfigurationResponse setBody(CreateHttpsBasicConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHttpsBasicConfigurationResponseBody getBody() {
        return this.body;
    }

}
