// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeDeletedClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeletedClustersResponseBody body;

    public static DescribeDeletedClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeletedClustersResponse self = new DescribeDeletedClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeletedClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeletedClustersResponse setBody(DescribeDeletedClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeletedClustersResponseBody getBody() {
        return this.body;
    }

}
