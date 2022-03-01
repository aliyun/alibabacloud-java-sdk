// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainAccountsV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainAccountsV2ResponseBody body;

    public static DescribeAntChainAccountsV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainAccountsV2Response self = new DescribeAntChainAccountsV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainAccountsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainAccountsV2Response setBody(DescribeAntChainAccountsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainAccountsV2ResponseBody getBody() {
        return this.body;
    }

}
