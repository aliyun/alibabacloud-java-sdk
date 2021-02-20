// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortAttackMaxFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePortAttackMaxFlowResponseBody body;

    public static DescribePortAttackMaxFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortAttackMaxFlowResponse self = new DescribePortAttackMaxFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortAttackMaxFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortAttackMaxFlowResponse setBody(DescribePortAttackMaxFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortAttackMaxFlowResponseBody getBody() {
        return this.body;
    }

}
