// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccountsResponseBody body;

    public static DescribeAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsResponse self = new DescribeAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountsResponse setBody(DescribeAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountsResponseBody getBody() {
        return this.body;
    }

}
