// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayUserNatStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePostpayUserNatStatusResponseBody body;

    public static DescribePostpayUserNatStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayUserNatStatusResponse self = new DescribePostpayUserNatStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribePostpayUserNatStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePostpayUserNatStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePostpayUserNatStatusResponse setBody(DescribePostpayUserNatStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePostpayUserNatStatusResponseBody getBody() {
        return this.body;
    }

}
