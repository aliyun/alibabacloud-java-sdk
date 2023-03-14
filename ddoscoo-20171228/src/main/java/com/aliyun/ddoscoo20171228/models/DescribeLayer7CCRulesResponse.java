// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLayer7CCRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLayer7CCRulesResponseBody body;

    public static DescribeLayer7CCRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer7CCRulesResponse self = new DescribeLayer7CCRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLayer7CCRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLayer7CCRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLayer7CCRulesResponse setBody(DescribeLayer7CCRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLayer7CCRulesResponseBody getBody() {
        return this.body;
    }

}
