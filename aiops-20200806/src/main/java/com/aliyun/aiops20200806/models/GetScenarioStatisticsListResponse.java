// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetScenarioStatisticsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScenarioStatisticsListResponseBody body;

    public static GetScenarioStatisticsListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScenarioStatisticsListResponse self = new GetScenarioStatisticsListResponse();
        return TeaModel.build(map, self);
    }

    public GetScenarioStatisticsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScenarioStatisticsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScenarioStatisticsListResponse setBody(GetScenarioStatisticsListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScenarioStatisticsListResponseBody getBody() {
        return this.body;
    }

}
