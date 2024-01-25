// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiRulesResponseBody body;

    public static DescribeApiRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiRulesResponse self = new DescribeApiRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiRulesResponse setBody(DescribeApiRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiRulesResponseBody getBody() {
        return this.body;
    }

}
