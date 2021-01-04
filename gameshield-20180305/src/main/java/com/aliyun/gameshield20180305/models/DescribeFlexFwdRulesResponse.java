// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexFwdRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlexFwdRulesResponseBody body;

    public static DescribeFlexFwdRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexFwdRulesResponse self = new DescribeFlexFwdRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlexFwdRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlexFwdRulesResponse setBody(DescribeFlexFwdRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlexFwdRulesResponseBody getBody() {
        return this.body;
    }

}
