// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeInstanceDasProResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceDasProResponseBody body;

    public static DescribeInstanceDasProResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDasProResponse self = new DescribeInstanceDasProResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDasProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceDasProResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceDasProResponse setBody(DescribeInstanceDasProResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceDasProResponseBody getBody() {
        return this.body;
    }

}
