// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestTransactionDigestsV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainLatestTransactionDigestsV2ResponseBody body;

    public static DescribeAntChainLatestTransactionDigestsV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestTransactionDigestsV2Response self = new DescribeAntChainLatestTransactionDigestsV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestTransactionDigestsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainLatestTransactionDigestsV2Response setBody(DescribeAntChainLatestTransactionDigestsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainLatestTransactionDigestsV2ResponseBody getBody() {
        return this.body;
    }

}
