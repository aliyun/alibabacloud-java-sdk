// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class SendVerificationNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendVerificationNewResponseBody body;

    public static SendVerificationNewResponse build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationNewResponse self = new SendVerificationNewResponse();
        return TeaModel.build(map, self);
    }

    public SendVerificationNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendVerificationNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendVerificationNewResponse setBody(SendVerificationNewResponseBody body) {
        this.body = body;
        return this;
    }
    public SendVerificationNewResponseBody getBody() {
        return this.body;
    }

}
