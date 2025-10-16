// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclRuleCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAclRuleCountResponseBody body;

    public static DescribeAclRuleCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclRuleCountResponse self = new DescribeAclRuleCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAclRuleCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAclRuleCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAclRuleCountResponse setBody(DescribeAclRuleCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAclRuleCountResponseBody getBody() {
        return this.body;
    }

}
