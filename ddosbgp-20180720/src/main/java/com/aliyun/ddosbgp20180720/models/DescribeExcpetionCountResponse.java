// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeExcpetionCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExcpetionCountResponseBody body;

    public static DescribeExcpetionCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcpetionCountResponse self = new DescribeExcpetionCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExcpetionCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExcpetionCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExcpetionCountResponse setBody(DescribeExcpetionCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExcpetionCountResponseBody getBody() {
        return this.body;
    }

}
