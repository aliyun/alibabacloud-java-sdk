// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallFullDuplexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LlmSmartCallFullDuplexResponseBody body;

    public static LlmSmartCallFullDuplexResponse build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallFullDuplexResponse self = new LlmSmartCallFullDuplexResponse();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallFullDuplexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LlmSmartCallFullDuplexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LlmSmartCallFullDuplexResponse setBody(LlmSmartCallFullDuplexResponseBody body) {
        this.body = body;
        return this;
    }
    public LlmSmartCallFullDuplexResponseBody getBody() {
        return this.body;
    }

}
