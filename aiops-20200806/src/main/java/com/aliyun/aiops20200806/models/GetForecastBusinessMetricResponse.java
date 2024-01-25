// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetForecastBusinessMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetForecastBusinessMetricResponseBody body;

    public static GetForecastBusinessMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetForecastBusinessMetricResponse self = new GetForecastBusinessMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetForecastBusinessMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetForecastBusinessMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetForecastBusinessMetricResponse setBody(GetForecastBusinessMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetForecastBusinessMetricResponseBody getBody() {
        return this.body;
    }

}
