// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightWorkitemVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportInsightWorkitemVersionResponseBody body;

    public static ExportInsightWorkitemVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightWorkitemVersionResponse self = new ExportInsightWorkitemVersionResponse();
        return TeaModel.build(map, self);
    }

    public ExportInsightWorkitemVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportInsightWorkitemVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportInsightWorkitemVersionResponse setBody(ExportInsightWorkitemVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportInsightWorkitemVersionResponseBody getBody() {
        return this.body;
    }

}
