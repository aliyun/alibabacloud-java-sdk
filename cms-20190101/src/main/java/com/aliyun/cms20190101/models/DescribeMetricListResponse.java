// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMetricListResponse setBody(DescribeMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricListResponseBody getBody() {
        return this.body;
    }

}
