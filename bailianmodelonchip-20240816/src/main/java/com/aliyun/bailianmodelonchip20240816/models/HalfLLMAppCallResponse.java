// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMAppCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HalfLLMAppCallResponseBody body;

    public static HalfLLMAppCallResponse build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMAppCallResponse self = new HalfLLMAppCallResponse();
        return TeaModel.build(map, self);
    }

    public HalfLLMAppCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HalfLLMAppCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HalfLLMAppCallResponse setBody(HalfLLMAppCallResponseBody body) {
        this.body = body;
        return this;
    }
    public HalfLLMAppCallResponseBody getBody() {
        return this.body;
    }

}
