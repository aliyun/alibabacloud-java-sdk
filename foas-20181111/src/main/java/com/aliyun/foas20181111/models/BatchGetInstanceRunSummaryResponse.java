// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class BatchGetInstanceRunSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetInstanceRunSummaryResponseBody body;

    public static BatchGetInstanceRunSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetInstanceRunSummaryResponse self = new BatchGetInstanceRunSummaryResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetInstanceRunSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetInstanceRunSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetInstanceRunSummaryResponse setBody(BatchGetInstanceRunSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetInstanceRunSummaryResponseBody getBody() {
        return this.body;
    }

}
