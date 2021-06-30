// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class DescribeVerifyTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVerifyTokenResponseBody body;

    public static DescribeVerifyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyTokenResponse self = new DescribeVerifyTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifyTokenResponse setBody(DescribeVerifyTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifyTokenResponseBody getBody() {
        return this.body;
    }

}
