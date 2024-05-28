// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportInsightSpaceResponseBody body;

    public static ExportInsightSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightSpaceResponse self = new ExportInsightSpaceResponse();
        return TeaModel.build(map, self);
    }

    public ExportInsightSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportInsightSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportInsightSpaceResponse setBody(ExportInsightSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportInsightSpaceResponseBody getBody() {
        return this.body;
    }

}
