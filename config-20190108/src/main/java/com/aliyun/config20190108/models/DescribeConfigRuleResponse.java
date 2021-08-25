// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConfigRuleResponseBody body;

    public static DescribeConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigRuleResponse self = new DescribeConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigRuleResponse setBody(DescribeConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigRuleResponseBody getBody() {
        return this.body;
    }

}
