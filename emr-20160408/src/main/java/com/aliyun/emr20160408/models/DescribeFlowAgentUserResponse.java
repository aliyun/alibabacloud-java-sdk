// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowAgentUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowAgentUserResponseBody body;

    public static DescribeFlowAgentUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowAgentUserResponse self = new DescribeFlowAgentUserResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowAgentUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowAgentUserResponse setBody(DescribeFlowAgentUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowAgentUserResponseBody getBody() {
        return this.body;
    }

}
