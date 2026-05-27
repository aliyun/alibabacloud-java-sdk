// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumComputeMetricsByUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SumComputeMetricsByUsageResponseBody body;

    public static SumComputeMetricsByUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        SumComputeMetricsByUsageResponse self = new SumComputeMetricsByUsageResponse();
        return TeaModel.build(map, self);
    }

    public SumComputeMetricsByUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SumComputeMetricsByUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SumComputeMetricsByUsageResponse setBody(SumComputeMetricsByUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public SumComputeMetricsByUsageResponseBody getBody() {
        return this.body;
    }

}
