// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateBatchOperateCardsTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBatchOperateCardsTaskResponseBody body;

    public static CreateBatchOperateCardsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchOperateCardsTaskResponse self = new CreateBatchOperateCardsTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateBatchOperateCardsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBatchOperateCardsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBatchOperateCardsTaskResponse setBody(CreateBatchOperateCardsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBatchOperateCardsTaskResponseBody getBody() {
        return this.body;
    }

}
