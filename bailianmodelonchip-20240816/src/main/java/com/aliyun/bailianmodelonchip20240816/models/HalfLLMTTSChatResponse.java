// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMTTSChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HalfLLMTTSChatResponseBody body;

    public static HalfLLMTTSChatResponse build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMTTSChatResponse self = new HalfLLMTTSChatResponse();
        return TeaModel.build(map, self);
    }

    public HalfLLMTTSChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HalfLLMTTSChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HalfLLMTTSChatResponse setBody(HalfLLMTTSChatResponseBody body) {
        this.body = body;
        return this;
    }
    public HalfLLMTTSChatResponseBody getBody() {
        return this.body;
    }

}
