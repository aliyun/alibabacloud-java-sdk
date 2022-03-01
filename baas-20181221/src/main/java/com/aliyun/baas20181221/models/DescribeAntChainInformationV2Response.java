// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainInformationV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainInformationV2ResponseBody body;

    public static DescribeAntChainInformationV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainInformationV2Response self = new DescribeAntChainInformationV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainInformationV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainInformationV2Response setBody(DescribeAntChainInformationV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainInformationV2ResponseBody getBody() {
        return this.body;
    }

}
