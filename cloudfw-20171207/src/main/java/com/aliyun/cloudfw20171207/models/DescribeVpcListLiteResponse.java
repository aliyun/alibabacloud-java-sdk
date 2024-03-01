// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcListLiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcListLiteResponseBody body;

    public static DescribeVpcListLiteResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcListLiteResponse self = new DescribeVpcListLiteResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcListLiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcListLiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcListLiteResponse setBody(DescribeVpcListLiteResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcListLiteResponseBody getBody() {
        return this.body;
    }

}
