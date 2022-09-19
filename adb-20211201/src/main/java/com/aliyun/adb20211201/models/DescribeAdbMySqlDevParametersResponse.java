// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlDevParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAdbMySqlDevParametersResponseBody body;

    public static DescribeAdbMySqlDevParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlDevParametersResponse self = new DescribeAdbMySqlDevParametersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlDevParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdbMySqlDevParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdbMySqlDevParametersResponse setBody(DescribeAdbMySqlDevParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdbMySqlDevParametersResponseBody getBody() {
        return this.body;
    }

}
