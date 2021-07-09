// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class BatchGetMediaInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetMediaInfosResponseBody body;

    public static BatchGetMediaInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetMediaInfosResponse self = new BatchGetMediaInfosResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetMediaInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetMediaInfosResponse setBody(BatchGetMediaInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetMediaInfosResponseBody getBody() {
        return this.body;
    }

}
