// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class CreateConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConfigurationResponseBody body;

    public static CreateConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigurationResponse self = new CreateConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConfigurationResponse setBody(CreateConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigurationResponseBody getBody() {
        return this.body;
    }

}
