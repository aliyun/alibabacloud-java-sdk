// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightWorkTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportInsightWorkTimeResponseBody body;

    public static ExportInsightWorkTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightWorkTimeResponse self = new ExportInsightWorkTimeResponse();
        return TeaModel.build(map, self);
    }

    public ExportInsightWorkTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportInsightWorkTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportInsightWorkTimeResponse setBody(ExportInsightWorkTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportInsightWorkTimeResponseBody getBody() {
        return this.body;
    }

}
