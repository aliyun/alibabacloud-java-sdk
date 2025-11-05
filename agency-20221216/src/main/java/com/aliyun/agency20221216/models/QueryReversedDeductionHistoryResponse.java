// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class QueryReversedDeductionHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryReversedDeductionHistoryResponseBody body;

    public static QueryReversedDeductionHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReversedDeductionHistoryResponse self = new QueryReversedDeductionHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryReversedDeductionHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReversedDeductionHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryReversedDeductionHistoryResponse setBody(QueryReversedDeductionHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReversedDeductionHistoryResponseBody getBody() {
        return this.body;
    }

}
