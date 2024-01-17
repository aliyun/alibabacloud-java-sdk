// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApisForConsoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApisForConsoleResponseBody body;

    public static DescribeApisForConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisForConsoleResponse self = new DescribeApisForConsoleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisForConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisForConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisForConsoleResponse setBody(DescribeApisForConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisForConsoleResponseBody getBody() {
        return this.body;
    }

}
