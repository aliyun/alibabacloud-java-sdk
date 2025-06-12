// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportCustomSourceAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportCustomSourceAnalysisTaskResponseBody body;

    public static ExportCustomSourceAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportCustomSourceAnalysisTaskResponse self = new ExportCustomSourceAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public ExportCustomSourceAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportCustomSourceAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportCustomSourceAnalysisTaskResponse setBody(ExportCustomSourceAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportCustomSourceAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
