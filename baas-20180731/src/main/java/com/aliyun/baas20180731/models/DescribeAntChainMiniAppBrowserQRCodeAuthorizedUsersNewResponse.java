// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody body;

    public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse setBody(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody getBody() {
        return this.body;
    }

}
