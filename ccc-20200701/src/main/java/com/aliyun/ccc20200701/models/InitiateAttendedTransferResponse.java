// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class InitiateAttendedTransferResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitiateAttendedTransferResponseBody body;

    public static InitiateAttendedTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        InitiateAttendedTransferResponse self = new InitiateAttendedTransferResponse();
        return TeaModel.build(map, self);
    }

    public InitiateAttendedTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitiateAttendedTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitiateAttendedTransferResponse setBody(InitiateAttendedTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public InitiateAttendedTransferResponseBody getBody() {
        return this.body;
    }

}
