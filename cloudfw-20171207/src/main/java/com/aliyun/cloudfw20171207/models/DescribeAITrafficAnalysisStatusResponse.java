// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAITrafficAnalysisStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAITrafficAnalysisStatusResponseBody body;

    public static DescribeAITrafficAnalysisStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAITrafficAnalysisStatusResponse self = new DescribeAITrafficAnalysisStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAITrafficAnalysisStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAITrafficAnalysisStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAITrafficAnalysisStatusResponse setBody(DescribeAITrafficAnalysisStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAITrafficAnalysisStatusResponseBody getBody() {
        return this.body;
    }

}
