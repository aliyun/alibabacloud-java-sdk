// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationScoreHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEvaluationScoreHistoryResponseBody body;

    public static ListEvaluationScoreHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationScoreHistoryResponse self = new ListEvaluationScoreHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListEvaluationScoreHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEvaluationScoreHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEvaluationScoreHistoryResponse setBody(ListEvaluationScoreHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEvaluationScoreHistoryResponseBody getBody() {
        return this.body;
    }

}
