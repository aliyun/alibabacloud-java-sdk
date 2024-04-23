// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayTrafficTotalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePostpayTrafficTotalResponseBody body;

    public static DescribePostpayTrafficTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayTrafficTotalResponse self = new DescribePostpayTrafficTotalResponse();
        return TeaModel.build(map, self);
    }

    public DescribePostpayTrafficTotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePostpayTrafficTotalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePostpayTrafficTotalResponse setBody(DescribePostpayTrafficTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePostpayTrafficTotalResponseBody getBody() {
        return this.body;
    }

}
