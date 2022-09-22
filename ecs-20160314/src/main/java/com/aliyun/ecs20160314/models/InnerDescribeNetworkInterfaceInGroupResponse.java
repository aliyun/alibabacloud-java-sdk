// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class InnerDescribeNetworkInterfaceInGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InnerDescribeNetworkInterfaceInGroupResponseBody body;

    public static InnerDescribeNetworkInterfaceInGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        InnerDescribeNetworkInterfaceInGroupResponse self = new InnerDescribeNetworkInterfaceInGroupResponse();
        return TeaModel.build(map, self);
    }

    public InnerDescribeNetworkInterfaceInGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InnerDescribeNetworkInterfaceInGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InnerDescribeNetworkInterfaceInGroupResponse setBody(InnerDescribeNetworkInterfaceInGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public InnerDescribeNetworkInterfaceInGroupResponseBody getBody() {
        return this.body;
    }

}
