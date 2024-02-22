// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomizeRuleResponseBody body;

    public static DescribeCustomizeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeRuleResponse self = new DescribeCustomizeRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomizeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomizeRuleResponse setBody(DescribeCustomizeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomizeRuleResponseBody getBody() {
        return this.body;
    }

}
