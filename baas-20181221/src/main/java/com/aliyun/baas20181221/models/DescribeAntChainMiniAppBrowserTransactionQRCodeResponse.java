// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserTransactionQRCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody body;

    public static DescribeAntChainMiniAppBrowserTransactionQRCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserTransactionQRCodeResponse self = new DescribeAntChainMiniAppBrowserTransactionQRCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponse setBody(DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody getBody() {
        return this.body;
    }

}
