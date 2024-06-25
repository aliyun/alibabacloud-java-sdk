// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendBatchSmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendBatchSmsResponseBody body;

    public static SendBatchSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        SendBatchSmsResponse self = new SendBatchSmsResponse();
        return TeaModel.build(map, self);
    }

    public SendBatchSmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendBatchSmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendBatchSmsResponse setBody(SendBatchSmsResponseBody body) {
        this.body = body;
        return this;
    }
    public SendBatchSmsResponseBody getBody() {
        return this.body;
    }

}
