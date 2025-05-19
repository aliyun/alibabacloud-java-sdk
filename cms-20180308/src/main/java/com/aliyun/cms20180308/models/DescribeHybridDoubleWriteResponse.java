// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeHybridDoubleWriteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridDoubleWriteResponseBody body;

    public static DescribeHybridDoubleWriteResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridDoubleWriteResponse self = new DescribeHybridDoubleWriteResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridDoubleWriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridDoubleWriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridDoubleWriteResponse setBody(DescribeHybridDoubleWriteResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridDoubleWriteResponseBody getBody() {
        return this.body;
    }

}
