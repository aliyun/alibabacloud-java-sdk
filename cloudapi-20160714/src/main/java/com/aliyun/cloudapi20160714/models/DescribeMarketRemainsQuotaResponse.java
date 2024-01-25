// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeMarketRemainsQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMarketRemainsQuotaResponseBody body;

    public static DescribeMarketRemainsQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMarketRemainsQuotaResponse self = new DescribeMarketRemainsQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMarketRemainsQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMarketRemainsQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMarketRemainsQuotaResponse setBody(DescribeMarketRemainsQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMarketRemainsQuotaResponseBody getBody() {
        return this.body;
    }

}
