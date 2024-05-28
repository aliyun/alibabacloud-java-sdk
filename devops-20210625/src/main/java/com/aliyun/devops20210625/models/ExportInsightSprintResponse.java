// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightSprintResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportInsightSprintResponseBody body;

    public static ExportInsightSprintResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightSprintResponse self = new ExportInsightSprintResponse();
        return TeaModel.build(map, self);
    }

    public ExportInsightSprintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportInsightSprintResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportInsightSprintResponse setBody(ExportInsightSprintResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportInsightSprintResponseBody getBody() {
        return this.body;
    }

}
