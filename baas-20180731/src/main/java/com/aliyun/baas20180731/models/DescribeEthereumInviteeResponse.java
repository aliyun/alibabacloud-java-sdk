// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumInviteeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEthereumInviteeResponseBody body;

    public static DescribeEthereumInviteeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumInviteeResponse self = new DescribeEthereumInviteeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumInviteeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEthereumInviteeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEthereumInviteeResponse setBody(DescribeEthereumInviteeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEthereumInviteeResponseBody getBody() {
        return this.body;
    }

}
