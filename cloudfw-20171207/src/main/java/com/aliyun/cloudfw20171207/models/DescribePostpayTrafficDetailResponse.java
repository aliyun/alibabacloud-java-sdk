// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayTrafficDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePostpayTrafficDetailResponseBody body;

    public static DescribePostpayTrafficDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayTrafficDetailResponse self = new DescribePostpayTrafficDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePostpayTrafficDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePostpayTrafficDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePostpayTrafficDetailResponse setBody(DescribePostpayTrafficDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePostpayTrafficDetailResponseBody getBody() {
        return this.body;
    }

}
