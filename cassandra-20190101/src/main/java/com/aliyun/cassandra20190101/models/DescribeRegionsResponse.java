// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRegionsResponseBody body;

    public static DescribeRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponse self = new DescribeRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionsResponse setBody(DescribeRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionsResponseBody getBody() {
        return this.body;
    }

}
