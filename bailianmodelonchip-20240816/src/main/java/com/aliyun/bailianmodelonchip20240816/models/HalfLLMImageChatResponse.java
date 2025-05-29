// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMImageChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HalfLLMImageChatResponseBody body;

    public static HalfLLMImageChatResponse build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMImageChatResponse self = new HalfLLMImageChatResponse();
        return TeaModel.build(map, self);
    }

    public HalfLLMImageChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HalfLLMImageChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HalfLLMImageChatResponse setBody(HalfLLMImageChatResponseBody body) {
        this.body = body;
        return this;
    }
    public HalfLLMImageChatResponseBody getBody() {
        return this.body;
    }

}
