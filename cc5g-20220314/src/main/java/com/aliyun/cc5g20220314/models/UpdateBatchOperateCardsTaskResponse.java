// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateBatchOperateCardsTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBatchOperateCardsTaskResponseBody body;

    public static UpdateBatchOperateCardsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchOperateCardsTaskResponse self = new UpdateBatchOperateCardsTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBatchOperateCardsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBatchOperateCardsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBatchOperateCardsTaskResponse setBody(UpdateBatchOperateCardsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBatchOperateCardsTaskResponseBody getBody() {
        return this.body;
    }

}
