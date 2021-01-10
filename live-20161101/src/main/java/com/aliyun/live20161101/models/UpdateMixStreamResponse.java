// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMixStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMixStreamResponseBody body;

    public static UpdateMixStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMixStreamResponse self = new UpdateMixStreamResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMixStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMixStreamResponse setBody(UpdateMixStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMixStreamResponseBody getBody() {
        return this.body;
    }

}
