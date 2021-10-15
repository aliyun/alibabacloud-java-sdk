// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class BatchInsertItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchInsertItemsResponse setBody(BatchInsertItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchInsertItemsResponseBody getBody() {
        return this.body;
    }

}
