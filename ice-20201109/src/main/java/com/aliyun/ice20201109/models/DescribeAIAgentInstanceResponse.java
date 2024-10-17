// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeAIAgentInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIAgentInstanceResponseBody body;

    public static DescribeAIAgentInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIAgentInstanceResponse self = new DescribeAIAgentInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIAgentInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIAgentInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIAgentInstanceResponse setBody(DescribeAIAgentInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIAgentInstanceResponseBody getBody() {
        return this.body;
    }

}
