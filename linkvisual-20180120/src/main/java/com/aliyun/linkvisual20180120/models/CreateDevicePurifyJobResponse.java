// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateDevicePurifyJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDevicePurifyJobResponseBody body;

    public static CreateDevicePurifyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicePurifyJobResponse self = new CreateDevicePurifyJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateDevicePurifyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDevicePurifyJobResponse setBody(CreateDevicePurifyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDevicePurifyJobResponseBody getBody() {
        return this.body;
    }

}
