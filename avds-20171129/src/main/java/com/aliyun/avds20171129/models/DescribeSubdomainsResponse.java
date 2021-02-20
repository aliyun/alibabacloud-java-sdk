// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeSubdomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSubdomainsResponseBody body;

    public static DescribeSubdomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubdomainsResponse self = new DescribeSubdomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubdomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubdomainsResponse setBody(DescribeSubdomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubdomainsResponseBody getBody() {
        return this.body;
    }

}
