// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class TransferStorageOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TransferStorageOrderResponseBody body;

    public static TransferStorageOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferStorageOrderResponse self = new TransferStorageOrderResponse();
        return TeaModel.build(map, self);
    }

    public TransferStorageOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferStorageOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferStorageOrderResponse setBody(TransferStorageOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferStorageOrderResponseBody getBody() {
        return this.body;
    }

}
