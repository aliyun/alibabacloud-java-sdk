// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterServiceConfigTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterServiceConfigTagResponseBody body;

    public static DescribeClusterServiceConfigTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterServiceConfigTagResponse self = new DescribeClusterServiceConfigTagResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterServiceConfigTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterServiceConfigTagResponse setBody(DescribeClusterServiceConfigTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterServiceConfigTagResponseBody getBody() {
        return this.body;
    }

}
