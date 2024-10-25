// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSecondaryPublicIpAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecondaryPublicIpAddressesResponseBody body;

    public static DescribeSecondaryPublicIpAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecondaryPublicIpAddressesResponse self = new DescribeSecondaryPublicIpAddressesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecondaryPublicIpAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecondaryPublicIpAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecondaryPublicIpAddressesResponse setBody(DescribeSecondaryPublicIpAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecondaryPublicIpAddressesResponseBody getBody() {
        return this.body;
    }

}
