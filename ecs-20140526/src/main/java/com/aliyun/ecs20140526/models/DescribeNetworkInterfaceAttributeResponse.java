// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfaceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeNetworkInterfaceAttributeResponse setBody(DescribeNetworkInterfaceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBody getBody() {
        return this.body;
    }

}
