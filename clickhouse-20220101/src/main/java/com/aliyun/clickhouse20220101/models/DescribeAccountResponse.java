// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccountResponseBody body;

    public static DescribeAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountResponse self = new DescribeAccountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountResponse setBody(DescribeAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountResponseBody getBody() {
        return this.body;
    }

}
