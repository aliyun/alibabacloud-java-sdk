// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateDeviceModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeviceModelResponseBody body;

    public static CreateDeviceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceModelResponse self = new CreateDeviceModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeviceModelResponse setBody(CreateDeviceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeviceModelResponseBody getBody() {
        return this.body;
    }

}
