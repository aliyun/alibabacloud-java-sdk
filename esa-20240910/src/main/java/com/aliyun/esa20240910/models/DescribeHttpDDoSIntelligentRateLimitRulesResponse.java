// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeHttpDDoSIntelligentRateLimitRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHttpDDoSIntelligentRateLimitRulesResponseBody body;

    public static DescribeHttpDDoSIntelligentRateLimitRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpDDoSIntelligentRateLimitRulesResponse self = new DescribeHttpDDoSIntelligentRateLimitRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHttpDDoSIntelligentRateLimitRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHttpDDoSIntelligentRateLimitRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHttpDDoSIntelligentRateLimitRulesResponse setBody(DescribeHttpDDoSIntelligentRateLimitRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHttpDDoSIntelligentRateLimitRulesResponseBody getBody() {
        return this.body;
    }

}
