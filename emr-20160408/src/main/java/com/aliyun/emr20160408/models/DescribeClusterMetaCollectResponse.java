// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterMetaCollectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterMetaCollectResponseBody body;

    public static DescribeClusterMetaCollectResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterMetaCollectResponse self = new DescribeClusterMetaCollectResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterMetaCollectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterMetaCollectResponse setBody(DescribeClusterMetaCollectResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterMetaCollectResponseBody getBody() {
        return this.body;
    }

}
