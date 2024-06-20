// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionStatisticsV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainTransactionStatisticsV2ResponseBody body;

    public static DescribeAntChainTransactionStatisticsV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionStatisticsV2Response self = new DescribeAntChainTransactionStatisticsV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionStatisticsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainTransactionStatisticsV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainTransactionStatisticsV2Response setBody(DescribeAntChainTransactionStatisticsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainTransactionStatisticsV2ResponseBody getBody() {
        return this.body;
    }

}
