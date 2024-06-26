// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse setBody(DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseBody getBody() {
        return this.body;
    }

}
