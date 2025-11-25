// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingRiskDomainAndIpCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOutgoingRiskDomainAndIpCountResponseBody body;

    public static DescribeOutgoingRiskDomainAndIpCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingRiskDomainAndIpCountResponse self = new DescribeOutgoingRiskDomainAndIpCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingRiskDomainAndIpCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOutgoingRiskDomainAndIpCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOutgoingRiskDomainAndIpCountResponse setBody(DescribeOutgoingRiskDomainAndIpCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOutgoingRiskDomainAndIpCountResponseBody getBody() {
        return this.body;
    }

}
