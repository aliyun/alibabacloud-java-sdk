// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainTransactionStatisticsResponseBody body;

    public static DescribeAntChainTransactionStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionStatisticsResponse self = new DescribeAntChainTransactionStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainTransactionStatisticsResponse setBody(DescribeAntChainTransactionStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainTransactionStatisticsResponseBody getBody() {
        return this.body;
    }

}
