// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody body;

    public static DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse self = new DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse setBody(DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody getBody() {
        return this.body;
    }

}
