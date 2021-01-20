// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomMetricListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCustomMetricListResponse setBody(DescribeCustomMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomMetricListResponseBody getBody() {
        return this.body;
    }

}
