// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallEncryptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LlmSmartCallEncryptResponseBody body;

    public static LlmSmartCallEncryptResponse build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallEncryptResponse self = new LlmSmartCallEncryptResponse();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallEncryptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LlmSmartCallEncryptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LlmSmartCallEncryptResponse setBody(LlmSmartCallEncryptResponseBody body) {
        this.body = body;
        return this;
    }
    public LlmSmartCallEncryptResponseBody getBody() {
        return this.body;
    }

}
