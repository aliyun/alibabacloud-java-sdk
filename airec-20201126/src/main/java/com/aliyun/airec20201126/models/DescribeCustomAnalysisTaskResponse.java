// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeCustomAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomAnalysisTaskResponseBody body;

    public static DescribeCustomAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomAnalysisTaskResponse self = new DescribeCustomAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomAnalysisTaskResponse setBody(DescribeCustomAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
