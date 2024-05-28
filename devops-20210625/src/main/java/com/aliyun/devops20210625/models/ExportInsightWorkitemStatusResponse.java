// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightWorkitemStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportInsightWorkitemStatusResponseBody body;

    public static ExportInsightWorkitemStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightWorkitemStatusResponse self = new ExportInsightWorkitemStatusResponse();
        return TeaModel.build(map, self);
    }

    public ExportInsightWorkitemStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportInsightWorkitemStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportInsightWorkitemStatusResponse setBody(ExportInsightWorkitemStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportInsightWorkitemStatusResponseBody getBody() {
        return this.body;
    }

}
