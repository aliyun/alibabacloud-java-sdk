// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeInstancePageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstancePageResponseBody body;

    public static DescribeInstancePageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePageResponse self = new DescribeInstancePageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstancePageResponse setBody(DescribeInstancePageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstancePageResponseBody getBody() {
        return this.body;
    }

}
