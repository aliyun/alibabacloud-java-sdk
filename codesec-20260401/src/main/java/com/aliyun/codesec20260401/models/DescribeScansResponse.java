// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScansResponseBody body;

    public static DescribeScansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScansResponse self = new DescribeScansResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScansResponse setBody(DescribeScansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScansResponseBody getBody() {
        return this.body;
    }

}
