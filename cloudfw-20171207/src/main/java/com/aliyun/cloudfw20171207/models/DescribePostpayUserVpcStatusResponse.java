// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayUserVpcStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePostpayUserVpcStatusResponseBody body;

    public static DescribePostpayUserVpcStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayUserVpcStatusResponse self = new DescribePostpayUserVpcStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribePostpayUserVpcStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePostpayUserVpcStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePostpayUserVpcStatusResponse setBody(DescribePostpayUserVpcStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePostpayUserVpcStatusResponseBody getBody() {
        return this.body;
    }

}
