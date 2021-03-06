// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeLayer4RulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLayer4RulesResponseBody body;

    public static DescribeLayer4RulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RulesResponse self = new DescribeLayer4RulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLayer4RulesResponse setBody(DescribeLayer4RulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLayer4RulesResponseBody getBody() {
        return this.body;
    }

}
