// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayEnabledProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePostpayEnabledProtectionResponseBody body;

    public static DescribePostpayEnabledProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayEnabledProtectionResponse self = new DescribePostpayEnabledProtectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribePostpayEnabledProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePostpayEnabledProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePostpayEnabledProtectionResponse setBody(DescribePostpayEnabledProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePostpayEnabledProtectionResponseBody getBody() {
        return this.body;
    }

}
