// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInvocationsResponseBody body;

    public static DescribeInvocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationsResponse self = new DescribeInvocationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInvocationsResponse setBody(DescribeInvocationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInvocationsResponseBody getBody() {
        return this.body;
    }

}
