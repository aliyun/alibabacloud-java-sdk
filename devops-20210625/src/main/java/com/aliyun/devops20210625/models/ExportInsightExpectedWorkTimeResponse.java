// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightExpectedWorkTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportInsightExpectedWorkTimeResponseBody body;

    public static ExportInsightExpectedWorkTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightExpectedWorkTimeResponse self = new ExportInsightExpectedWorkTimeResponse();
        return TeaModel.build(map, self);
    }

    public ExportInsightExpectedWorkTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportInsightExpectedWorkTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportInsightExpectedWorkTimeResponse setBody(ExportInsightExpectedWorkTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportInsightExpectedWorkTimeResponseBody getBody() {
        return this.body;
    }

}
