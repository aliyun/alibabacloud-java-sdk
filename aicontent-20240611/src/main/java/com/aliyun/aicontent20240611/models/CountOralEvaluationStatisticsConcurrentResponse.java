// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CountOralEvaluationStatisticsConcurrentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CountOralEvaluationStatisticsConcurrentResponseBody body;

    public static CountOralEvaluationStatisticsConcurrentResponse build(java.util.Map<String, ?> map) throws Exception {
        CountOralEvaluationStatisticsConcurrentResponse self = new CountOralEvaluationStatisticsConcurrentResponse();
        return TeaModel.build(map, self);
    }

    public CountOralEvaluationStatisticsConcurrentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountOralEvaluationStatisticsConcurrentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountOralEvaluationStatisticsConcurrentResponse setBody(CountOralEvaluationStatisticsConcurrentResponseBody body) {
        this.body = body;
        return this;
    }
    public CountOralEvaluationStatisticsConcurrentResponseBody getBody() {
        return this.body;
    }

}
