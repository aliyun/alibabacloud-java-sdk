// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeHttpDDoSIntelligentAclRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHttpDDoSIntelligentAclRulesResponseBody body;

    public static DescribeHttpDDoSIntelligentAclRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpDDoSIntelligentAclRulesResponse self = new DescribeHttpDDoSIntelligentAclRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHttpDDoSIntelligentAclRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHttpDDoSIntelligentAclRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHttpDDoSIntelligentAclRulesResponse setBody(DescribeHttpDDoSIntelligentAclRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHttpDDoSIntelligentAclRulesResponseBody getBody() {
        return this.body;
    }

}
