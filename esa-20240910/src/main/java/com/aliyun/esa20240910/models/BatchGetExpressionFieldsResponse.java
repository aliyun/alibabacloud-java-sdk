// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchGetExpressionFieldsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetExpressionFieldsResponseBody body;

    public static BatchGetExpressionFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetExpressionFieldsResponse self = new BatchGetExpressionFieldsResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetExpressionFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetExpressionFieldsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetExpressionFieldsResponse setBody(BatchGetExpressionFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetExpressionFieldsResponseBody getBody() {
        return this.body;
    }

}
