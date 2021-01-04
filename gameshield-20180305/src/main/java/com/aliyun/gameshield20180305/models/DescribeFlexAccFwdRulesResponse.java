// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexAccFwdRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlexAccFwdRulesResponseBody body;

    public static DescribeFlexAccFwdRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexAccFwdRulesResponse self = new DescribeFlexAccFwdRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlexAccFwdRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlexAccFwdRulesResponse setBody(DescribeFlexAccFwdRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlexAccFwdRulesResponseBody getBody() {
        return this.body;
    }

}
