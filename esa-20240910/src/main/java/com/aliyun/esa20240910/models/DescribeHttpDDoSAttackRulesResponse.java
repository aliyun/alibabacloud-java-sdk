// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeHttpDDoSAttackRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHttpDDoSAttackRulesResponseBody body;

    public static DescribeHttpDDoSAttackRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpDDoSAttackRulesResponse self = new DescribeHttpDDoSAttackRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHttpDDoSAttackRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHttpDDoSAttackRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHttpDDoSAttackRulesResponse setBody(DescribeHttpDDoSAttackRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHttpDDoSAttackRulesResponseBody getBody() {
        return this.body;
    }

}
