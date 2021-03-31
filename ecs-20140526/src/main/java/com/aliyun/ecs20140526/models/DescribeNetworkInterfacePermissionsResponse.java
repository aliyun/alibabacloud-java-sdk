// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacePermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworkInterfacePermissionsResponseBody body;

    public static DescribeNetworkInterfacePermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacePermissionsResponse self = new DescribeNetworkInterfacePermissionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfacePermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkInterfacePermissionsResponse setBody(DescribeNetworkInterfacePermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkInterfacePermissionsResponseBody getBody() {
        return this.body;
    }

}
