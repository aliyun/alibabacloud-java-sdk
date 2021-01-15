// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDeviceFormResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeviceFormResponseBody body;

    public static CreateDeviceFormResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceFormResponse self = new CreateDeviceFormResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceFormResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeviceFormResponse setBody(CreateDeviceFormResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeviceFormResponseBody getBody() {
        return this.body;
    }

}
