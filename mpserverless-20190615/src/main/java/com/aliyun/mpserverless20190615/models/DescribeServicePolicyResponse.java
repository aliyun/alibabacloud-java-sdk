// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeServicePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServicePolicyResponseBody body;

    public static DescribeServicePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServicePolicyResponse self = new DescribeServicePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServicePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServicePolicyResponse setBody(DescribeServicePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServicePolicyResponseBody getBody() {
        return this.body;
    }

}
