// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomizeRuleTestResponseBody body;

    public static DescribeCustomizeRuleTestResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeRuleTestResponse self = new DescribeCustomizeRuleTestResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeRuleTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomizeRuleTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomizeRuleTestResponse setBody(DescribeCustomizeRuleTestResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomizeRuleTestResponseBody getBody() {
        return this.body;
    }

}
