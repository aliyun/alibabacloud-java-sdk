// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortAttackMaxFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribePortAttackMaxFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePortAttackMaxFlowResponse setBody(DescribePortAttackMaxFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortAttackMaxFlowResponseBody getBody() {
        return this.body;
    }

}
