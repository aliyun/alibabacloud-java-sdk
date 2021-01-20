// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricTopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMetricTopResponseBody body;

    public static DescribeMetricTopResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricTopResponse self = new DescribeMetricTopResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricTopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricTopResponse setBody(DescribeMetricTopResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricTopResponseBody getBody() {
        return this.body;
    }

}
