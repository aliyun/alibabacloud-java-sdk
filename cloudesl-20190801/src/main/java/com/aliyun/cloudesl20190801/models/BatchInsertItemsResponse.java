// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class BatchInsertItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchInsertItemsResponseBody body;

    public static BatchInsertItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchInsertItemsResponse self = new BatchInsertItemsResponse();
        return TeaModel.build(map, self);
    }

    public BatchInsertItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchInsertItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchInsertItemsResponse setBody(BatchInsertItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchInsertItemsResponseBody getBody() {
        return this.body;
    }

}
