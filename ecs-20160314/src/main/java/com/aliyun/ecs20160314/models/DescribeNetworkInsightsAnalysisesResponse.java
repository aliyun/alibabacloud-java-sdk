// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeNetworkInsightsAnalysisesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworkInsightsAnalysisesResponseBody body;

    public static DescribeNetworkInsightsAnalysisesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInsightsAnalysisesResponse self = new DescribeNetworkInsightsAnalysisesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInsightsAnalysisesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkInsightsAnalysisesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkInsightsAnalysisesResponse setBody(DescribeNetworkInsightsAnalysisesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkInsightsAnalysisesResponseBody getBody() {
        return this.body;
    }

}
