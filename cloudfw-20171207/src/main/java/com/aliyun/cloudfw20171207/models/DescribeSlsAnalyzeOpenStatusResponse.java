// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSlsAnalyzeOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlsAnalyzeOpenStatusResponseBody body;

    public static DescribeSlsAnalyzeOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsAnalyzeOpenStatusResponse self = new DescribeSlsAnalyzeOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsAnalyzeOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlsAnalyzeOpenStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlsAnalyzeOpenStatusResponse setBody(DescribeSlsAnalyzeOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlsAnalyzeOpenStatusResponseBody getBody() {
        return this.body;
    }

}
