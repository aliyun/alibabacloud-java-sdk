// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateGrabFrameTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGrabFrameTaskResponseBody body;

    public static CreateGrabFrameTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGrabFrameTaskResponse self = new CreateGrabFrameTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateGrabFrameTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGrabFrameTaskResponse setBody(CreateGrabFrameTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGrabFrameTaskResponseBody getBody() {
        return this.body;
    }

}
