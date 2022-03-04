// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeRunningQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRunningQueryResponseBody body;

    public static DescribeRunningQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunningQueryResponse self = new DescribeRunningQueryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRunningQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRunningQueryResponse setBody(DescribeRunningQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRunningQueryResponseBody getBody() {
        return this.body;
    }

}
