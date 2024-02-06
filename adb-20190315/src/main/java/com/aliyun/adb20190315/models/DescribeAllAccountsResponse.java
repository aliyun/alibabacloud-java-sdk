// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAllAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAllAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllAccountsResponse setBody(DescribeAllAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllAccountsResponseBody getBody() {
        return this.body;
    }

}
