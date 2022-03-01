// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectContentTreeV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainContractProjectContentTreeV2ResponseBody body;

    public static DescribeAntChainContractProjectContentTreeV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectContentTreeV2Response self = new DescribeAntChainContractProjectContentTreeV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectContentTreeV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainContractProjectContentTreeV2Response setBody(DescribeAntChainContractProjectContentTreeV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainContractProjectContentTreeV2ResponseBody getBody() {
        return this.body;
    }

}
