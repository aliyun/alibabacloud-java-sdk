// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAgentTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgentTaskResponseBody body;

    public static DescribeAgentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentTaskResponse self = new DescribeAgentTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgentTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgentTaskResponse setBody(DescribeAgentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgentTaskResponseBody getBody() {
        return this.body;
    }

}
