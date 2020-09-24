// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreateServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceResponseBody body;

    public static CreateServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceResponse self = new CreateServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceResponse setBody(CreateServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceResponseBody getBody() {
        return this.body;
    }

}
