// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddASMIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddASMIntegrationResponseBody body;

    public static AddASMIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddASMIntegrationResponse self = new AddASMIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public AddASMIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddASMIntegrationResponse setBody(AddASMIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddASMIntegrationResponseBody getBody() {
        return this.body;
    }

}
