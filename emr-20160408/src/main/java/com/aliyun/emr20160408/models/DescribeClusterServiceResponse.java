// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterServiceResponseBody body;

    public static DescribeClusterServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterServiceResponse self = new DescribeClusterServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterServiceResponse setBody(DescribeClusterServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterServiceResponseBody getBody() {
        return this.body;
    }

}
