// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionReceiptV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainTransactionReceiptV2ResponseBody body;

    public static DescribeAntChainTransactionReceiptV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionReceiptV2Response self = new DescribeAntChainTransactionReceiptV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionReceiptV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainTransactionReceiptV2Response setBody(DescribeAntChainTransactionReceiptV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainTransactionReceiptV2ResponseBody getBody() {
        return this.body;
    }

}
