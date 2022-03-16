// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeServerlessClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServerlessClusterResponseBody body;

    public static DescribeServerlessClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerlessClusterResponse self = new DescribeServerlessClusterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServerlessClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServerlessClusterResponse setBody(DescribeServerlessClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServerlessClusterResponseBody getBody() {
        return this.body;
    }

}
