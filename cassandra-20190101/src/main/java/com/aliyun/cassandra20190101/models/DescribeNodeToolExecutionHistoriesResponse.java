// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeNodeToolExecutionHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNodeToolExecutionHistoriesResponseBody body;

    public static DescribeNodeToolExecutionHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeToolExecutionHistoriesResponse self = new DescribeNodeToolExecutionHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeToolExecutionHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeToolExecutionHistoriesResponse setBody(DescribeNodeToolExecutionHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeToolExecutionHistoriesResponseBody getBody() {
        return this.body;
    }

}
