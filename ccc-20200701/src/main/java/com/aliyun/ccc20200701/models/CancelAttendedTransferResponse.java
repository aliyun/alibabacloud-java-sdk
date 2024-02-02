// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CancelAttendedTransferResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelAttendedTransferResponseBody body;

    public static CancelAttendedTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAttendedTransferResponse self = new CancelAttendedTransferResponse();
        return TeaModel.build(map, self);
    }

    public CancelAttendedTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAttendedTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAttendedTransferResponse setBody(CancelAttendedTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAttendedTransferResponseBody getBody() {
        return this.body;
    }

}
