// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TransferNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferNodeResponseBody body;

    public static TransferNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferNodeResponse self = new TransferNodeResponse();
        return TeaModel.build(map, self);
    }

    public TransferNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferNodeResponse setBody(TransferNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferNodeResponseBody getBody() {
        return this.body;
    }

}
