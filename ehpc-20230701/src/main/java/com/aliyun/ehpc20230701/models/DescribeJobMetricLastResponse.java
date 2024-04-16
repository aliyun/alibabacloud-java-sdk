// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class DescribeJobMetricLastResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeJobMetricLastResponseBody body;

    public static DescribeJobMetricLastResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobMetricLastResponse self = new DescribeJobMetricLastResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobMetricLastResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobMetricLastResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJobMetricLastResponse setBody(DescribeJobMetricLastResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobMetricLastResponseBody getBody() {
        return this.body;
    }

}
