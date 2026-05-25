// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmFullDuplexCallOperateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LlmFullDuplexCallOperateResponseBody body;

    public static LlmFullDuplexCallOperateResponse build(java.util.Map<String, ?> map) throws Exception {
        LlmFullDuplexCallOperateResponse self = new LlmFullDuplexCallOperateResponse();
        return TeaModel.build(map, self);
    }

    public LlmFullDuplexCallOperateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LlmFullDuplexCallOperateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LlmFullDuplexCallOperateResponse setBody(LlmFullDuplexCallOperateResponseBody body) {
        this.body = body;
        return this;
    }
    public LlmFullDuplexCallOperateResponseBody getBody() {
        return this.body;
    }

}
