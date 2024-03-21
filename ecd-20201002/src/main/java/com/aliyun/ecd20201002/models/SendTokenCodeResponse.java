// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SendTokenCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendTokenCodeResponseBody body;

    public static SendTokenCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SendTokenCodeResponse self = new SendTokenCodeResponse();
        return TeaModel.build(map, self);
    }

    public SendTokenCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendTokenCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendTokenCodeResponse setBody(SendTokenCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SendTokenCodeResponseBody getBody() {
        return this.body;
    }

}
