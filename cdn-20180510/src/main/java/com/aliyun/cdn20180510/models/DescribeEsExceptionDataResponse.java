// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeEsExceptionDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEsExceptionDataResponseBody body;

    public static DescribeEsExceptionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEsExceptionDataResponse self = new DescribeEsExceptionDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEsExceptionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEsExceptionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEsExceptionDataResponse setBody(DescribeEsExceptionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEsExceptionDataResponseBody getBody() {
        return this.body;
    }

}
