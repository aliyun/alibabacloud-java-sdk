// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionReceiptV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAntChainTransactionReceiptV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainTransactionReceiptV2Response setBody(DescribeAntChainTransactionReceiptV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainTransactionReceiptV2ResponseBody getBody() {
        return this.body;
    }

}
