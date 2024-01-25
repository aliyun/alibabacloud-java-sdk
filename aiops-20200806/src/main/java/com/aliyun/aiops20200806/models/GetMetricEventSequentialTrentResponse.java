// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetMetricEventSequentialTrentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetricEventSequentialTrentResponseBody body;

    public static GetMetricEventSequentialTrentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetricEventSequentialTrentResponse self = new GetMetricEventSequentialTrentResponse();
        return TeaModel.build(map, self);
    }

    public GetMetricEventSequentialTrentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetricEventSequentialTrentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetricEventSequentialTrentResponse setBody(GetMetricEventSequentialTrentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetricEventSequentialTrentResponseBody getBody() {
        return this.body;
    }

}
