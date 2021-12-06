// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateAccessConfigurationResponse setBody(CreateAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
