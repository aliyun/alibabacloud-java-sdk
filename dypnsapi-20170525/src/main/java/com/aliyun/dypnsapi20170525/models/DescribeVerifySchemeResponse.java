// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class DescribeVerifySchemeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVerifySchemeResponseBody body;

    public static DescribeVerifySchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySchemeResponse self = new DescribeVerifySchemeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifySchemeResponse setBody(DescribeVerifySchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifySchemeResponseBody getBody() {
        return this.body;
    }

}
