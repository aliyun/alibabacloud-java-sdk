// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceMenuSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceMenuSwitchResponseBody body;

    public static DescribeInstanceMenuSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMenuSwitchResponse self = new DescribeInstanceMenuSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMenuSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceMenuSwitchResponse setBody(DescribeInstanceMenuSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceMenuSwitchResponseBody getBody() {
        return this.body;
    }

}
