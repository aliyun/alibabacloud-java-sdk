// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServersResponseBody body;

    public static DescribeServersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServersResponse self = new DescribeServersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServersResponse setBody(DescribeServersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServersResponseBody getBody() {
        return this.body;
    }

}
