// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightTagRefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportInsightTagRefResponseBody body;

    public static ExportInsightTagRefResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightTagRefResponse self = new ExportInsightTagRefResponse();
        return TeaModel.build(map, self);
    }

    public ExportInsightTagRefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportInsightTagRefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportInsightTagRefResponse setBody(ExportInsightTagRefResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportInsightTagRefResponseBody getBody() {
        return this.body;
    }

}
