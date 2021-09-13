// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CompleteAttendedTransferResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CompleteAttendedTransferResponse setBody(CompleteAttendedTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteAttendedTransferResponseBody getBody() {
        return this.body;
    }

}
