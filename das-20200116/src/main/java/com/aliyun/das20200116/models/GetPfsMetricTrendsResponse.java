// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsMetricTrendsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPfsMetricTrendsResponseBody body;

    public static GetPfsMetricTrendsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPfsMetricTrendsResponse self = new GetPfsMetricTrendsResponse();
        return TeaModel.build(map, self);
    }

    public GetPfsMetricTrendsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPfsMetricTrendsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPfsMetricTrendsResponse setBody(GetPfsMetricTrendsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPfsMetricTrendsResponseBody getBody() {
        return this.body;
    }

}
