// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumInvitaionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEthereumInvitaionResponseBody body;

    public static DescribeEthereumInvitaionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumInvitaionResponse self = new DescribeEthereumInvitaionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumInvitaionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEthereumInvitaionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEthereumInvitaionResponse setBody(DescribeEthereumInvitaionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEthereumInvitaionResponseBody getBody() {
        return this.body;
    }

}
