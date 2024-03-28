// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class TransferProduceOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferProduceOwnerResponseBody body;

    public static TransferProduceOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferProduceOwnerResponse self = new TransferProduceOwnerResponse();
        return TeaModel.build(map, self);
    }

    public TransferProduceOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferProduceOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferProduceOwnerResponse setBody(TransferProduceOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferProduceOwnerResponseBody getBody() {
        return this.body;
    }

}
