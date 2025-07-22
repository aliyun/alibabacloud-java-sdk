// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeIpAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIpAddressesResponseBody body;

    public static DescribeIpAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpAddressesResponse self = new DescribeIpAddressesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpAddressesResponse setBody(DescribeIpAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpAddressesResponseBody getBody() {
        return this.body;
    }

}
