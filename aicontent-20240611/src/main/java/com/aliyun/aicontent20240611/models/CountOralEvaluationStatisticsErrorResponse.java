// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CountOralEvaluationStatisticsErrorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CountOralEvaluationStatisticsErrorResponseBody body;

    public static CountOralEvaluationStatisticsErrorResponse build(java.util.Map<String, ?> map) throws Exception {
        CountOralEvaluationStatisticsErrorResponse self = new CountOralEvaluationStatisticsErrorResponse();
        return TeaModel.build(map, self);
    }

    public CountOralEvaluationStatisticsErrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountOralEvaluationStatisticsErrorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountOralEvaluationStatisticsErrorResponse setBody(CountOralEvaluationStatisticsErrorResponseBody body) {
        this.body = body;
        return this;
    }
    public CountOralEvaluationStatisticsErrorResponseBody getBody() {
        return this.body;
    }

}
