// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebPreciseAccessRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebPreciseAccessRuleResponseBody body;

    public static DescribeWebPreciseAccessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebPreciseAccessRuleResponse self = new DescribeWebPreciseAccessRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebPreciseAccessRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebPreciseAccessRuleResponse setBody(DescribeWebPreciseAccessRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebPreciseAccessRuleResponseBody getBody() {
        return this.body;
    }

}
