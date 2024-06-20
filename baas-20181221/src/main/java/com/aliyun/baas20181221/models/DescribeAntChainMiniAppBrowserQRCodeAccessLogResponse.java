// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBody body;

    public static DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse self = new DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse setBody(DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseBody getBody() {
        return this.body;
    }

}
