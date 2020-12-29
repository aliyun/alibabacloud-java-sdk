// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddIntegrationResponseBody body;

    public static AddIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIntegrationResponse self = new AddIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public AddIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIntegrationResponse setBody(AddIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIntegrationResponseBody getBody() {
        return this.body;
    }

}
