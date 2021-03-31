// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesFullStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstancesFullStatusResponseBody body;

    public static DescribeInstancesFullStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesFullStatusResponse self = new DescribeInstancesFullStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesFullStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstancesFullStatusResponse setBody(DescribeInstancesFullStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstancesFullStatusResponseBody getBody() {
        return this.body;
    }

}
