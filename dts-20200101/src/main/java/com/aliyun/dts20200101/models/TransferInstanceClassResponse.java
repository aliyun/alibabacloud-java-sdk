// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class TransferInstanceClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferInstanceClassResponseBody body;

    public static TransferInstanceClassResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferInstanceClassResponse self = new TransferInstanceClassResponse();
        return TeaModel.build(map, self);
    }

    public TransferInstanceClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferInstanceClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferInstanceClassResponse setBody(TransferInstanceClassResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferInstanceClassResponseBody getBody() {
        return this.body;
    }

}
