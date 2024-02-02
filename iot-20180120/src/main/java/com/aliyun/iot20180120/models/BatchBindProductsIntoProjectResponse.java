// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchBindProductsIntoProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchBindProductsIntoProjectResponseBody body;

    public static BatchBindProductsIntoProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchBindProductsIntoProjectResponse self = new BatchBindProductsIntoProjectResponse();
        return TeaModel.build(map, self);
    }

    public BatchBindProductsIntoProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchBindProductsIntoProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchBindProductsIntoProjectResponse setBody(BatchBindProductsIntoProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchBindProductsIntoProjectResponseBody getBody() {
        return this.body;
    }

}
