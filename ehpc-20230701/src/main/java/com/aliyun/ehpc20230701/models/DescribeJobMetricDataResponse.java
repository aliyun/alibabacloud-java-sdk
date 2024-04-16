// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class DescribeJobMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeJobMetricDataResponseBody body;

    public static DescribeJobMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobMetricDataResponse self = new DescribeJobMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJobMetricDataResponse setBody(DescribeJobMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobMetricDataResponseBody getBody() {
        return this.body;
    }

}
