// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainBlockV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainBlockV2ResponseBody body;

    public static DescribeAntChainBlockV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainBlockV2Response self = new DescribeAntChainBlockV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainBlockV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainBlockV2Response setBody(DescribeAntChainBlockV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainBlockV2ResponseBody getBody() {
        return this.body;
    }

}
