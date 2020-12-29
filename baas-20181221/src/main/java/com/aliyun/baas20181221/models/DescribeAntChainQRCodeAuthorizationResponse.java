// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainQRCodeAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAntChainQRCodeAuthorizationResponse setBody(DescribeAntChainQRCodeAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainQRCodeAuthorizationResponseBody getBody() {
        return this.body;
    }

}
