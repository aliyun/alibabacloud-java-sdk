// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class GetBatchEvaluateTaskReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBatchEvaluateTaskReportResponseBody body;

    public static GetBatchEvaluateTaskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchEvaluateTaskReportResponse self = new GetBatchEvaluateTaskReportResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchEvaluateTaskReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchEvaluateTaskReportResponse setBody(GetBatchEvaluateTaskReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchEvaluateTaskReportResponseBody getBody() {
        return this.body;
    }

}
