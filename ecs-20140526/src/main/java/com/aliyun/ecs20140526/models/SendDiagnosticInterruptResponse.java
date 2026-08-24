// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class SendDiagnosticInterruptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendDiagnosticInterruptResponseBody body;

    public static SendDiagnosticInterruptResponse build(java.util.Map<String, ?> map) throws Exception {
        SendDiagnosticInterruptResponse self = new SendDiagnosticInterruptResponse();
        return TeaModel.build(map, self);
    }

    public SendDiagnosticInterruptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendDiagnosticInterruptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendDiagnosticInterruptResponse setBody(SendDiagnosticInterruptResponseBody body) {
        this.body = body;
        return this;
    }
    public SendDiagnosticInterruptResponseBody getBody() {
        return this.body;
    }

}
