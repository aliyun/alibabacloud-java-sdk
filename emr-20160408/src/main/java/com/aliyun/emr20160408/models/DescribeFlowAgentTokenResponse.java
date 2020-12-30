// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowAgentTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowAgentTokenResponseBody body;

    public static DescribeFlowAgentTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowAgentTokenResponse self = new DescribeFlowAgentTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowAgentTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowAgentTokenResponse setBody(DescribeFlowAgentTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowAgentTokenResponseBody getBody() {
        return this.body;
    }

}
