// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceVncPasswdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceVncPasswdResponseBody body;

    public static DescribeInstanceVncPasswdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceVncPasswdResponse self = new DescribeInstanceVncPasswdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceVncPasswdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceVncPasswdResponse setBody(DescribeInstanceVncPasswdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceVncPasswdResponseBody getBody() {
        return this.body;
    }

}
