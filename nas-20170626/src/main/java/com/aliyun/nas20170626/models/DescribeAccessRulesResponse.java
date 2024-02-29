// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccessRulesResponseBody body;

    public static DescribeAccessRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessRulesResponse self = new DescribeAccessRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessRulesResponse setBody(DescribeAccessRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessRulesResponseBody getBody() {
        return this.body;
    }

}
