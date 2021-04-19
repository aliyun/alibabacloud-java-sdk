// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSlowLogTrendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlowLogTrendResponseBody body;

    public static DescribeSlowLogTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogTrendResponse self = new DescribeSlowLogTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowLogTrendResponse setBody(DescribeSlowLogTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowLogTrendResponseBody getBody() {
        return this.body;
    }

}
