// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainQRCodeAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainQRCodeAuthorizationResponseBody body;

    public static DescribeAntChainQRCodeAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainQRCodeAuthorizationResponse self = new DescribeAntChainQRCodeAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainQRCodeAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainQRCodeAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainQRCodeAuthorizationResponse setBody(DescribeAntChainQRCodeAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainQRCodeAuthorizationResponseBody getBody() {
        return this.body;
    }

}
