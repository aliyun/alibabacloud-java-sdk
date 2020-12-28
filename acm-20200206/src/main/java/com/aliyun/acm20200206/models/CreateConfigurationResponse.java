// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class CreateConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateConfigurationResponse setBody(CreateConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigurationResponseBody getBody() {
        return this.body;
    }

}
