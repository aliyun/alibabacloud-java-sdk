// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostOptimizationOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCostOptimizationOverviewResponseBody body;

    public static DescribeCostOptimizationOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostOptimizationOverviewResponse self = new DescribeCostOptimizationOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCostOptimizationOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCostOptimizationOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCostOptimizationOverviewResponse setBody(DescribeCostOptimizationOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCostOptimizationOverviewResponseBody getBody() {
        return this.body;
    }

}
