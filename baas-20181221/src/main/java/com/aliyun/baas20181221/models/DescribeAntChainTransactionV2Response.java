// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainTransactionV2ResponseBody body;

    public static DescribeAntChainTransactionV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionV2Response self = new DescribeAntChainTransactionV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainTransactionV2Response setBody(DescribeAntChainTransactionV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainTransactionV2ResponseBody getBody() {
        return this.body;
    }

}
