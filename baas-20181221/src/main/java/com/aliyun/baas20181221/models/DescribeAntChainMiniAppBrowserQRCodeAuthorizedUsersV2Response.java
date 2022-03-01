// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody body;

    public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response setBody(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody getBody() {
        return this.body;
    }

}
