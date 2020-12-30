// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeJobErrorCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeJobErrorCodeResponseBody body;

    public static DescribeJobErrorCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobErrorCodeResponse self = new DescribeJobErrorCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobErrorCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobErrorCodeResponse setBody(DescribeJobErrorCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobErrorCodeResponseBody getBody() {
        return this.body;
    }

}
