// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CountOralEvaluationStatisticsCallsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CountOralEvaluationStatisticsCallsResponseBody body;

    public static CountOralEvaluationStatisticsCallsResponse build(java.util.Map<String, ?> map) throws Exception {
        CountOralEvaluationStatisticsCallsResponse self = new CountOralEvaluationStatisticsCallsResponse();
        return TeaModel.build(map, self);
    }

    public CountOralEvaluationStatisticsCallsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountOralEvaluationStatisticsCallsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountOralEvaluationStatisticsCallsResponse setBody(CountOralEvaluationStatisticsCallsResponseBody body) {
        this.body = body;
        return this;
    }
    public CountOralEvaluationStatisticsCallsResponseBody getBody() {
        return this.body;
    }

}
