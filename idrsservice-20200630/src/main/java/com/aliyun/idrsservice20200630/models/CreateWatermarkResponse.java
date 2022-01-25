// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWatermarkResponseBody body;

    public static CreateWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWatermarkResponse self = new CreateWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public CreateWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWatermarkResponse setBody(CreateWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWatermarkResponseBody getBody() {
        return this.body;
    }

}
