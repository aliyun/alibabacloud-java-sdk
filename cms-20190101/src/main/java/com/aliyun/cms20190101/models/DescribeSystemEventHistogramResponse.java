// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventHistogramResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSystemEventHistogramResponseBody body;

    public static DescribeSystemEventHistogramResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventHistogramResponse self = new DescribeSystemEventHistogramResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventHistogramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSystemEventHistogramResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSystemEventHistogramResponse setBody(DescribeSystemEventHistogramResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSystemEventHistogramResponseBody getBody() {
        return this.body;
    }

}
