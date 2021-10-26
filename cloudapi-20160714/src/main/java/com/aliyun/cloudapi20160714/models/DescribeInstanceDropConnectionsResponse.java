// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceDropConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceDropConnectionsResponseBody body;

    public static DescribeInstanceDropConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDropConnectionsResponse self = new DescribeInstanceDropConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDropConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceDropConnectionsResponse setBody(DescribeInstanceDropConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceDropConnectionsResponseBody getBody() {
        return this.body;
    }

}
