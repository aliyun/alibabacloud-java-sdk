// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeOpenAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOpenAccountResponseBody body;

    public static DescribeOpenAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenAccountResponse self = new DescribeOpenAccountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenAccountResponse setBody(DescribeOpenAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenAccountResponseBody getBody() {
        return this.body;
    }

}
