// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEipAddressesResponseBody body;

    public static DescribeEipAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesResponse self = new DescribeEipAddressesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEipAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEipAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEipAddressesResponse setBody(DescribeEipAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEipAddressesResponseBody getBody() {
        return this.body;
    }

}
