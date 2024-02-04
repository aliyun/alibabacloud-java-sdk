// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class TransferVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferVersionResponseBody body;

    public static TransferVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferVersionResponse self = new TransferVersionResponse();
        return TeaModel.build(map, self);
    }

    public TransferVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferVersionResponse setBody(TransferVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferVersionResponseBody getBody() {
        return this.body;
    }

}
