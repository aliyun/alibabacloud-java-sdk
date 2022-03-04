// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeClusterStatusSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterStatusSetResponseBody body;

    public static DescribeClusterStatusSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterStatusSetResponse self = new DescribeClusterStatusSetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterStatusSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterStatusSetResponse setBody(DescribeClusterStatusSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterStatusSetResponseBody getBody() {
        return this.body;
    }

}
