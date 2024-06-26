// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody body;

    public static DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse self = new DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse setBody(DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponseBody getBody() {
        return this.body;
    }

}
