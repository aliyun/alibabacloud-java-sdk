// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionStatisticsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainTransactionStatisticsNewResponseBody body;

    public static DescribeAntChainTransactionStatisticsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionStatisticsNewResponse self = new DescribeAntChainTransactionStatisticsNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionStatisticsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainTransactionStatisticsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainTransactionStatisticsNewResponse setBody(DescribeAntChainTransactionStatisticsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainTransactionStatisticsNewResponseBody getBody() {
        return this.body;
    }

}
