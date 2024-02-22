// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetricListResponseBody body;

    public static DescribeMetricListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricListResponse self = new DescribeMetricListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricListResponse setBody(DescribeMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricListResponseBody getBody() {
        return this.body;
    }

}
