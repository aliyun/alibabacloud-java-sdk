// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeUserBusinessBehaviorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserBusinessBehaviorResponseBody body;

    public static DescribeUserBusinessBehaviorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBusinessBehaviorResponse self = new DescribeUserBusinessBehaviorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserBusinessBehaviorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserBusinessBehaviorResponse setBody(DescribeUserBusinessBehaviorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserBusinessBehaviorResponseBody getBody() {
        return this.body;
    }

}
