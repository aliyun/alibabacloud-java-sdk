// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomizeRuleCountResponseBody body;

    public static DescribeCustomizeRuleCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeRuleCountResponse self = new DescribeCustomizeRuleCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeRuleCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomizeRuleCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomizeRuleCountResponse setBody(DescribeCustomizeRuleCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomizeRuleCountResponseBody getBody() {
        return this.body;
    }

}
