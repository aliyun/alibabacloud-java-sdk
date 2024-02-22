// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomMetricListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomMetricListResponseBody body;

    public static DescribeCustomMetricListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomMetricListResponse self = new DescribeCustomMetricListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomMetricListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomMetricListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomMetricListResponse setBody(DescribeCustomMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomMetricListResponseBody getBody() {
        return this.body;
    }

}
