// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDataAgentSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataAgentSessionResponseBody body;

    public static DescribeDataAgentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAgentSessionResponse self = new DescribeDataAgentSessionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataAgentSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataAgentSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataAgentSessionResponse setBody(DescribeDataAgentSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataAgentSessionResponseBody getBody() {
        return this.body;
    }

}
