// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUnbindProjectProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUnbindProjectProductsResponseBody body;

    public static BatchUnbindProjectProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindProjectProductsResponse self = new BatchUnbindProjectProductsResponse();
        return TeaModel.build(map, self);
    }

    public BatchUnbindProjectProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUnbindProjectProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUnbindProjectProductsResponse setBody(BatchUnbindProjectProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUnbindProjectProductsResponseBody getBody() {
        return this.body;
    }

}
