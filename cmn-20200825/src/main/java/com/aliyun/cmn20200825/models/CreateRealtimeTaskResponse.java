// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateRealtimeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRealtimeTaskResponseBody body;

    public static CreateRealtimeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRealtimeTaskResponse self = new CreateRealtimeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRealtimeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRealtimeTaskResponse setBody(CreateRealtimeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRealtimeTaskResponseBody getBody() {
        return this.body;
    }

}
