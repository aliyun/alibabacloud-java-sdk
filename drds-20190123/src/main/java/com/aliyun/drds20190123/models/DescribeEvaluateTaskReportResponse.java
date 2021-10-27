// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluateTaskReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEvaluateTaskReportResponseBody body;

    public static DescribeEvaluateTaskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateTaskReportResponse self = new DescribeEvaluateTaskReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateTaskReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEvaluateTaskReportResponse setBody(DescribeEvaluateTaskReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEvaluateTaskReportResponseBody getBody() {
        return this.body;
    }

}
