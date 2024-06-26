// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainQRCodeAuthorizationNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainQRCodeAuthorizationNewResponseBody body;

    public static DescribeAntChainQRCodeAuthorizationNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainQRCodeAuthorizationNewResponse self = new DescribeAntChainQRCodeAuthorizationNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainQRCodeAuthorizationNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainQRCodeAuthorizationNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainQRCodeAuthorizationNewResponse setBody(DescribeAntChainQRCodeAuthorizationNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainQRCodeAuthorizationNewResponseBody getBody() {
        return this.body;
    }

}
