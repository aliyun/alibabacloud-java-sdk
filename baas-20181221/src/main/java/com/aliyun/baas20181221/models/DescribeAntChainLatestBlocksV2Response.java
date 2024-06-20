// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestBlocksV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAntChainLatestBlocksV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainLatestBlocksV2Response setBody(DescribeAntChainLatestBlocksV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainLatestBlocksV2ResponseBody getBody() {
        return this.body;
    }

}
