// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribePortRulePageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePortRulePageResponseBody body;

    public static DescribePortRulePageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortRulePageResponse self = new DescribePortRulePageResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortRulePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortRulePageResponse setBody(DescribePortRulePageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortRulePageResponseBody getBody() {
        return this.body;
    }

}
