// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class RunForecastAnalyzeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunForecastAnalyzeResponseBody body;

    public static RunForecastAnalyzeResponse build(java.util.Map<String, ?> map) throws Exception {
        RunForecastAnalyzeResponse self = new RunForecastAnalyzeResponse();
        return TeaModel.build(map, self);
    }

    public RunForecastAnalyzeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunForecastAnalyzeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunForecastAnalyzeResponse setBody(RunForecastAnalyzeResponseBody body) {
        this.body = body;
        return this;
    }
    public RunForecastAnalyzeResponseBody getBody() {
        return this.body;
    }

}
