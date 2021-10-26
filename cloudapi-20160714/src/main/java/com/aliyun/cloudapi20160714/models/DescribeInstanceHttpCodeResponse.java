// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceHttpCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceHttpCodeResponseBody body;

    public static DescribeInstanceHttpCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHttpCodeResponse self = new DescribeInstanceHttpCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceHttpCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceHttpCodeResponse setBody(DescribeInstanceHttpCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceHttpCodeResponseBody getBody() {
        return this.body;
    }

}
