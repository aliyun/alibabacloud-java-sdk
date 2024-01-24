// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class InitSmartVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitSmartVerifyResponseBody body;

    public static InitSmartVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        InitSmartVerifyResponse self = new InitSmartVerifyResponse();
        return TeaModel.build(map, self);
    }

    public InitSmartVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitSmartVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitSmartVerifyResponse setBody(InitSmartVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public InitSmartVerifyResponseBody getBody() {
        return this.body;
    }

}
