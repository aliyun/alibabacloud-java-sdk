// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProjectInfoResponseBody body;

    public static DescribeProjectInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectInfoResponse self = new DescribeProjectInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProjectInfoResponse setBody(DescribeProjectInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectInfoResponseBody getBody() {
        return this.body;
    }

}
