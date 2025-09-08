// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultimodalAsyncModerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MultimodalAsyncModerationResponseBody body;

    public static MultimodalAsyncModerationResponse build(java.util.Map<String, ?> map) throws Exception {
        MultimodalAsyncModerationResponse self = new MultimodalAsyncModerationResponse();
        return TeaModel.build(map, self);
    }

    public MultimodalAsyncModerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultimodalAsyncModerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MultimodalAsyncModerationResponse setBody(MultimodalAsyncModerationResponseBody body) {
        this.body = body;
        return this;
    }
    public MultimodalAsyncModerationResponseBody getBody() {
        return this.body;
    }

}
