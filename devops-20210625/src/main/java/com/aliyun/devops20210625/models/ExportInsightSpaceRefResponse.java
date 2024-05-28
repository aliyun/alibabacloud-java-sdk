// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightSpaceRefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportInsightSpaceRefResponseBody body;

    public static ExportInsightSpaceRefResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightSpaceRefResponse self = new ExportInsightSpaceRefResponse();
        return TeaModel.build(map, self);
    }

    public ExportInsightSpaceRefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportInsightSpaceRefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportInsightSpaceRefResponse setBody(ExportInsightSpaceRefResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportInsightSpaceRefResponseBody getBody() {
        return this.body;
    }

}
