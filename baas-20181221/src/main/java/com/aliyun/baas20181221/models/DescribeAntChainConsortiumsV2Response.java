// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainConsortiumsV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainConsortiumsV2ResponseBody body;

    public static DescribeAntChainConsortiumsV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainConsortiumsV2Response self = new DescribeAntChainConsortiumsV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainConsortiumsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainConsortiumsV2Response setBody(DescribeAntChainConsortiumsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainConsortiumsV2ResponseBody getBody() {
        return this.body;
    }

}
