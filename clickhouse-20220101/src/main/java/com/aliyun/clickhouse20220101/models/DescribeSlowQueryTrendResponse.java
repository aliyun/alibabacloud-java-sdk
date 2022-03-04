// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeSlowQueryTrendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlowQueryTrendResponseBody body;

    public static DescribeSlowQueryTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowQueryTrendResponse self = new DescribeSlowQueryTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowQueryTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowQueryTrendResponse setBody(DescribeSlowQueryTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowQueryTrendResponseBody getBody() {
        return this.body;
    }

}
