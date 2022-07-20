// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePlayMetricDataResponseBody body;

    public static DescribePlayMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayMetricDataResponse self = new DescribePlayMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlayMetricDataResponse setBody(DescribePlayMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayMetricDataResponseBody getBody() {
        return this.body;
    }

}
