// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeNetworkInsightsAnalysisResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworkInsightsAnalysisResultResponseBody body;

    public static DescribeNetworkInsightsAnalysisResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInsightsAnalysisResultResponse self = new DescribeNetworkInsightsAnalysisResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInsightsAnalysisResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkInsightsAnalysisResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkInsightsAnalysisResultResponse setBody(DescribeNetworkInsightsAnalysisResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkInsightsAnalysisResultResponseBody getBody() {
        return this.body;
    }

}
