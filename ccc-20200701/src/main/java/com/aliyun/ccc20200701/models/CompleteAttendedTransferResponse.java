// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CompleteAttendedTransferResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompleteAttendedTransferResponseBody body;

    public static CompleteAttendedTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteAttendedTransferResponse self = new CompleteAttendedTransferResponse();
        return TeaModel.build(map, self);
    }

    public CompleteAttendedTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteAttendedTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteAttendedTransferResponse setBody(CompleteAttendedTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteAttendedTransferResponseBody getBody() {
        return this.body;
    }

}
