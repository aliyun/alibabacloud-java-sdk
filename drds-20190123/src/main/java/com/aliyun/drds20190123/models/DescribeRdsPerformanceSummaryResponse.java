// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsPerformanceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsPerformanceSummaryResponseBody body;

    public static DescribeRdsPerformanceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsPerformanceSummaryResponse self = new DescribeRdsPerformanceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsPerformanceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsPerformanceSummaryResponse setBody(DescribeRdsPerformanceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsPerformanceSummaryResponseBody getBody() {
        return this.body;
    }

}
