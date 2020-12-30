// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class CreateGifTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGifTaskResponseBody body;

    public static CreateGifTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGifTaskResponse self = new CreateGifTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateGifTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGifTaskResponse setBody(CreateGifTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGifTaskResponseBody getBody() {
        return this.body;
    }

}
