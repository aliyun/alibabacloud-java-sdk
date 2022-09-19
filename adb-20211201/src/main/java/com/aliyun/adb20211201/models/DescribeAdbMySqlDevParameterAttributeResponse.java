// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlDevParameterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAdbMySqlDevParameterAttributeResponseBody body;

    public static DescribeAdbMySqlDevParameterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlDevParameterAttributeResponse self = new DescribeAdbMySqlDevParameterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlDevParameterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdbMySqlDevParameterAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdbMySqlDevParameterAttributeResponse setBody(DescribeAdbMySqlDevParameterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdbMySqlDevParameterAttributeResponseBody getBody() {
        return this.body;
    }

}
