// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMImageOcrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HalfLLMImageOcrResponseBody body;

    public static HalfLLMImageOcrResponse build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMImageOcrResponse self = new HalfLLMImageOcrResponse();
        return TeaModel.build(map, self);
    }

    public HalfLLMImageOcrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HalfLLMImageOcrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HalfLLMImageOcrResponse setBody(HalfLLMImageOcrResponseBody body) {
        this.body = body;
        return this;
    }
    public HalfLLMImageOcrResponseBody getBody() {
        return this.body;
    }

}
