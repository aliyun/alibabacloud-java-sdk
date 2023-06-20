// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchGetStoreTextDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetStoreTextDataResponseBody body;

    public static BatchGetStoreTextDataResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetStoreTextDataResponse self = new BatchGetStoreTextDataResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetStoreTextDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetStoreTextDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetStoreTextDataResponse setBody(BatchGetStoreTextDataResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetStoreTextDataResponseBody getBody() {
        return this.body;
    }

}
