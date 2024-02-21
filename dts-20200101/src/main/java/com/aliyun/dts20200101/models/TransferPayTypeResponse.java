// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class TransferPayTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferPayTypeResponseBody body;

    public static TransferPayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferPayTypeResponse self = new TransferPayTypeResponse();
        return TeaModel.build(map, self);
    }

    public TransferPayTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferPayTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferPayTypeResponse setBody(TransferPayTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferPayTypeResponseBody getBody() {
        return this.body;
    }

}
