// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfaceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworkInterfaceAttributeResponseBody body;

    public static DescribeNetworkInterfaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfaceAttributeResponse self = new DescribeNetworkInterfaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfaceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkInterfaceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkInterfaceAttributeResponse setBody(DescribeNetworkInterfaceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBody getBody() {
        return this.body;
    }

}
