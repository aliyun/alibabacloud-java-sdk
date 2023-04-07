// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserProfilePathRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserProfilePathRulesResponseBody body;

    public static DescribeUserProfilePathRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserProfilePathRulesResponse self = new DescribeUserProfilePathRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserProfilePathRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserProfilePathRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserProfilePathRulesResponse setBody(DescribeUserProfilePathRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserProfilePathRulesResponseBody getBody() {
        return this.body;
    }

}
