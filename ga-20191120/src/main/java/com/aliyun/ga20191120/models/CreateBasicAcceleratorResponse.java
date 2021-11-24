// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBasicAcceleratorResponseBody body;

    public static CreateBasicAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicAcceleratorResponse self = new CreateBasicAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public CreateBasicAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBasicAcceleratorResponse setBody(CreateBasicAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBasicAcceleratorResponseBody getBody() {
        return this.body;
    }

}
