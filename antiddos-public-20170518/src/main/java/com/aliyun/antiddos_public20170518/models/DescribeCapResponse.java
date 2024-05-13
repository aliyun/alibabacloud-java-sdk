// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeCapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCapResponseBody body;

    public static DescribeCapResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapResponse self = new DescribeCapResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCapResponse setBody(DescribeCapResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCapResponseBody getBody() {
        return this.body;
    }

}
