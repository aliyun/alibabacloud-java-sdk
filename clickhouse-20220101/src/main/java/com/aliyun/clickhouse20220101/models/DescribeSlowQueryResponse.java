// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeSlowQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlowQueryResponseBody body;

    public static DescribeSlowQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowQueryResponse self = new DescribeSlowQueryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowQueryResponse setBody(DescribeSlowQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowQueryResponseBody getBody() {
        return this.body;
    }

}
