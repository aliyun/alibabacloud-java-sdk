// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeOssOauthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOssOauthResponseBody body;

    public static DescribeOssOauthResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssOauthResponse self = new DescribeOssOauthResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssOauthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssOauthResponse setBody(DescribeOssOauthResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssOauthResponseBody getBody() {
        return this.body;
    }

}
