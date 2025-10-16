// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayUserInternetStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePostpayUserInternetStatusResponseBody body;

    public static DescribePostpayUserInternetStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayUserInternetStatusResponse self = new DescribePostpayUserInternetStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribePostpayUserInternetStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePostpayUserInternetStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePostpayUserInternetStatusResponse setBody(DescribePostpayUserInternetStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePostpayUserInternetStatusResponseBody getBody() {
        return this.body;
    }

}
