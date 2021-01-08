// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeUserMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserMetricsResponseBody body;

    public static DescribeUserMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserMetricsResponse self = new DescribeUserMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserMetricsResponse setBody(DescribeUserMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserMetricsResponseBody getBody() {
        return this.body;
    }

}
