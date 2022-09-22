// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class StartNetworkInsightsAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartNetworkInsightsAnalysisResponseBody body;

    public static StartNetworkInsightsAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        StartNetworkInsightsAnalysisResponse self = new StartNetworkInsightsAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public StartNetworkInsightsAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartNetworkInsightsAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartNetworkInsightsAnalysisResponse setBody(StartNetworkInsightsAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public StartNetworkInsightsAnalysisResponseBody getBody() {
        return this.body;
    }

}
