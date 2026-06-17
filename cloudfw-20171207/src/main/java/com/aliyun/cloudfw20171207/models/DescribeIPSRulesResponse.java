// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeIPSRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIPSRulesResponseBody body;

    public static DescribeIPSRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPSRulesResponse self = new DescribeIPSRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIPSRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIPSRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIPSRulesResponse setBody(DescribeIPSRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIPSRulesResponseBody getBody() {
        return this.body;
    }

}
