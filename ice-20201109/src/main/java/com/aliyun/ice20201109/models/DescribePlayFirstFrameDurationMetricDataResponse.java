// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayFirstFrameDurationMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePlayFirstFrameDurationMetricDataResponseBody body;

    public static DescribePlayFirstFrameDurationMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayFirstFrameDurationMetricDataResponse self = new DescribePlayFirstFrameDurationMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayFirstFrameDurationMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayFirstFrameDurationMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlayFirstFrameDurationMetricDataResponse setBody(DescribePlayFirstFrameDurationMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayFirstFrameDurationMetricDataResponseBody getBody() {
        return this.body;
    }

}
