// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAntChainTransactionStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainTransactionStatisticsResponse setBody(DescribeAntChainTransactionStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainTransactionStatisticsResponseBody getBody() {
        return this.body;
    }

}
