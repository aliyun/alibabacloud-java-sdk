// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendBatchCardSmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendBatchCardSmsResponseBody body;

    public static SendBatchCardSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        SendBatchCardSmsResponse self = new SendBatchCardSmsResponse();
        return TeaModel.build(map, self);
    }

    public SendBatchCardSmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendBatchCardSmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendBatchCardSmsResponse setBody(SendBatchCardSmsResponseBody body) {
        this.body = body;
        return this;
    }
    public SendBatchCardSmsResponseBody getBody() {
        return this.body;
    }

}
