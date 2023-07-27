// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSessionStatisticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSessionStatisticResponseBody body;

    public static DescribeSessionStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionStatisticResponse self = new DescribeSessionStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSessionStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSessionStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSessionStatisticResponse setBody(DescribeSessionStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSessionStatisticResponseBody getBody() {
        return this.body;
    }

}
