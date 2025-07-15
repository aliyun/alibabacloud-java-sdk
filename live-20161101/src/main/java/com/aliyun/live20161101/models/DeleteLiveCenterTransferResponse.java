// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveCenterTransferResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveCenterTransferResponseBody body;

    public static DeleteLiveCenterTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveCenterTransferResponse self = new DeleteLiveCenterTransferResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveCenterTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveCenterTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveCenterTransferResponse setBody(DeleteLiveCenterTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveCenterTransferResponseBody getBody() {
        return this.body;
    }

}
