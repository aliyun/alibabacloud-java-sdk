// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeInstanceIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceIpAddressResponseBody body;

    public static DescribeInstanceIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceIpAddressResponse self = new DescribeInstanceIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceIpAddressResponse setBody(DescribeInstanceIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceIpAddressResponseBody getBody() {
        return this.body;
    }

}
