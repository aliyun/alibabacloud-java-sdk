// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody body;

    public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse setBody(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody getBody() {
        return this.body;
    }

}
