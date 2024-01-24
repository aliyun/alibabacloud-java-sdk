// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLogAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogAnalysisResponseBody body;

    public static DescribeLogAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogAnalysisResponse self = new DescribeLogAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogAnalysisResponse setBody(DescribeLogAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogAnalysisResponseBody getBody() {
        return this.body;
    }

}
