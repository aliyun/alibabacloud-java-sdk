// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainQRCodeAuthorizationV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainQRCodeAuthorizationV2ResponseBody body;

    public static DescribeAntChainQRCodeAuthorizationV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainQRCodeAuthorizationV2Response self = new DescribeAntChainQRCodeAuthorizationV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainQRCodeAuthorizationV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainQRCodeAuthorizationV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainQRCodeAuthorizationV2Response setBody(DescribeAntChainQRCodeAuthorizationV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainQRCodeAuthorizationV2ResponseBody getBody() {
        return this.body;
    }

}
