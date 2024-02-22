// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventHistogramResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomEventHistogramResponseBody body;

    public static DescribeCustomEventHistogramResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventHistogramResponse self = new DescribeCustomEventHistogramResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEventHistogramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomEventHistogramResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomEventHistogramResponse setBody(DescribeCustomEventHistogramResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomEventHistogramResponseBody getBody() {
        return this.body;
    }

}
