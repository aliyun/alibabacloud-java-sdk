// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAllAccountsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAllAccountsResponseBody body;

    public static DescribeAllAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllAccountsResponse self = new DescribeAllAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllAccountsResponse setBody(DescribeAllAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllAccountsResponseBody getBody() {
        return this.body;
    }

}
