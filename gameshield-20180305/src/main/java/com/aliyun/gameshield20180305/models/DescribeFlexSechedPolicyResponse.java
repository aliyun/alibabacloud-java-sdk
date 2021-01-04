// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexSechedPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlexSechedPolicyResponseBody body;

    public static DescribeFlexSechedPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexSechedPolicyResponse self = new DescribeFlexSechedPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlexSechedPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlexSechedPolicyResponse setBody(DescribeFlexSechedPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlexSechedPolicyResponseBody getBody() {
        return this.body;
    }

}
