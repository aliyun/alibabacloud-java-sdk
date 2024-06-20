// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserTransactionQRCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponse setBody(DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponseBody getBody() {
        return this.body;
    }

}
