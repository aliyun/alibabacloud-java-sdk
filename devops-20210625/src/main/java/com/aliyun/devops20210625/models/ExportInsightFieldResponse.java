// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportInsightFieldResponseBody body;

    public static ExportInsightFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightFieldResponse self = new ExportInsightFieldResponse();
        return TeaModel.build(map, self);
    }

    public ExportInsightFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportInsightFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportInsightFieldResponse setBody(ExportInsightFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportInsightFieldResponseBody getBody() {
        return this.body;
    }

}
