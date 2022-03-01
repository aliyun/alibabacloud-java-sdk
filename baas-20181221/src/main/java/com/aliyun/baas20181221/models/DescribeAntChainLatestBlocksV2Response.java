// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestBlocksV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainLatestBlocksV2ResponseBody body;

    public static DescribeAntChainLatestBlocksV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestBlocksV2Response self = new DescribeAntChainLatestBlocksV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestBlocksV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainLatestBlocksV2Response setBody(DescribeAntChainLatestBlocksV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainLatestBlocksV2ResponseBody getBody() {
        return this.body;
    }

}
