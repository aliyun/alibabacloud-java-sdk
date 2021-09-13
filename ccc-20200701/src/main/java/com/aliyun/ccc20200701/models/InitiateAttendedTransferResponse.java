// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class InitiateAttendedTransferResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public InitiateAttendedTransferResponse setBody(InitiateAttendedTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public InitiateAttendedTransferResponseBody getBody() {
        return this.body;
    }

}
