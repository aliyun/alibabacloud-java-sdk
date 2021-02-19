// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeScalingRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingRulesResponseBody body;

    public static DescribeScalingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingRulesResponse self = new DescribeScalingRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingRulesResponse setBody(DescribeScalingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingRulesResponseBody getBody() {
        return this.body;
    }

}
