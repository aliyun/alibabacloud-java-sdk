// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightCustomValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportInsightCustomValueResponseBody body;

    public static ExportInsightCustomValueResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightCustomValueResponse self = new ExportInsightCustomValueResponse();
        return TeaModel.build(map, self);
    }

    public ExportInsightCustomValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportInsightCustomValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportInsightCustomValueResponse setBody(ExportInsightCustomValueResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportInsightCustomValueResponseBody getBody() {
        return this.body;
    }

}
