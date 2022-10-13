// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopMetricListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDesktopMetricListResponseBody body;

    public static DescribeDesktopMetricListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopMetricListResponse self = new DescribeDesktopMetricListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopMetricListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopMetricListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDesktopMetricListResponse setBody(DescribeDesktopMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopMetricListResponseBody getBody() {
        return this.body;
    }

}
