// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateDeviceBrandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeviceBrandResponseBody body;

    public static CreateDeviceBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceBrandResponse self = new CreateDeviceBrandResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeviceBrandResponse setBody(CreateDeviceBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeviceBrandResponseBody getBody() {
        return this.body;
    }

}
