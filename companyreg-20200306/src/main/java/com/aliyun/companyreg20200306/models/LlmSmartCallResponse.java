// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class LlmSmartCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LlmSmartCallResponseBody body;

    public static LlmSmartCallResponse build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallResponse self = new LlmSmartCallResponse();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LlmSmartCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LlmSmartCallResponse setBody(LlmSmartCallResponseBody body) {
        this.body = body;
        return this;
    }
    public LlmSmartCallResponseBody getBody() {
        return this.body;
    }

}
