// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRuleResponseBody body;

    public static DescribeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleResponse self = new DescribeRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleResponse setBody(DescribeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleResponseBody getBody() {
        return this.body;
    }

}
