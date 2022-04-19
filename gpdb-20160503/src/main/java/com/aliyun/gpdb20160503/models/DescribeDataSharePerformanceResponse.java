// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataSharePerformanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataSharePerformanceResponseBody body;

    public static DescribeDataSharePerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSharePerformanceResponse self = new DescribeDataSharePerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSharePerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSharePerformanceResponse setBody(DescribeDataSharePerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSharePerformanceResponseBody getBody() {
        return this.body;
    }

}
