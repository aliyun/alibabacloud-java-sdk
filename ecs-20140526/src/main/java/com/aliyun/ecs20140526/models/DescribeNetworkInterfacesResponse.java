// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworkInterfacesResponseBody body;

    public static DescribeNetworkInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacesResponse self = new DescribeNetworkInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkInterfacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkInterfacesResponse setBody(DescribeNetworkInterfacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkInterfacesResponseBody getBody() {
        return this.body;
    }

}
