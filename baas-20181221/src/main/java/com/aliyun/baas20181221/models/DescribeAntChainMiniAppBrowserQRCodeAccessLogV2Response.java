// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody body;

    public static DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response self = new DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response setBody(DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseBody getBody() {
        return this.body;
    }

}
