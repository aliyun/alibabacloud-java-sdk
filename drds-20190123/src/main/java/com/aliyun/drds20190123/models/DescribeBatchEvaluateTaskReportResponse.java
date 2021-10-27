// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBatchEvaluateTaskReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBatchEvaluateTaskReportResponseBody body;

    public static DescribeBatchEvaluateTaskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchEvaluateTaskReportResponse self = new DescribeBatchEvaluateTaskReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBatchEvaluateTaskReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBatchEvaluateTaskReportResponse setBody(DescribeBatchEvaluateTaskReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBatchEvaluateTaskReportResponseBody getBody() {
        return this.body;
    }

}
