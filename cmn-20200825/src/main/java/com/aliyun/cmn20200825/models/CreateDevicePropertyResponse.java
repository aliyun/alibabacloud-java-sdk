// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDevicePropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDevicePropertyResponseBody body;

    public static CreateDevicePropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicePropertyResponse self = new CreateDevicePropertyResponse();
        return TeaModel.build(map, self);
    }

    public CreateDevicePropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDevicePropertyResponse setBody(CreateDevicePropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDevicePropertyResponseBody getBody() {
        return this.body;
    }

}
