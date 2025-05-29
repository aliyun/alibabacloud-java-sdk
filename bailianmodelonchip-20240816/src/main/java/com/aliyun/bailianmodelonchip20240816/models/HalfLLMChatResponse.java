// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HalfLLMChatResponseBody body;

    public static HalfLLMChatResponse build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMChatResponse self = new HalfLLMChatResponse();
        return TeaModel.build(map, self);
    }

    public HalfLLMChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HalfLLMChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HalfLLMChatResponse setBody(HalfLLMChatResponseBody body) {
        this.body = body;
        return this;
    }
    public HalfLLMChatResponseBody getBody() {
        return this.body;
    }

}
