// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteBatchOperateCardsTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBatchOperateCardsTaskResponseBody body;

    public static DeleteBatchOperateCardsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBatchOperateCardsTaskResponse self = new DeleteBatchOperateCardsTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBatchOperateCardsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBatchOperateCardsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBatchOperateCardsTaskResponse setBody(DeleteBatchOperateCardsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBatchOperateCardsTaskResponseBody getBody() {
        return this.body;
    }

}
