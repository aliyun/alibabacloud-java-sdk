// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribePerformanceViewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePerformanceViewAttributeResponseBody body;

    public static DescribePerformanceViewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePerformanceViewAttributeResponse self = new DescribePerformanceViewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribePerformanceViewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePerformanceViewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePerformanceViewAttributeResponse setBody(DescribePerformanceViewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePerformanceViewAttributeResponseBody getBody() {
        return this.body;
    }

}
