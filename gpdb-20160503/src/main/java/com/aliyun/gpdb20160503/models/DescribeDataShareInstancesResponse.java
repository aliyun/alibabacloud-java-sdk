// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataShareInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataShareInstancesResponseBody body;

    public static DescribeDataShareInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataShareInstancesResponse self = new DescribeDataShareInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataShareInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataShareInstancesResponse setBody(DescribeDataShareInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataShareInstancesResponseBody getBody() {
        return this.body;
    }

}
