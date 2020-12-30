// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterConnectionResponseBody body;

    public static DescribeClusterConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterConnectionResponse self = new DescribeClusterConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterConnectionResponse setBody(DescribeClusterConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterConnectionResponseBody getBody() {
        return this.body;
    }

}
