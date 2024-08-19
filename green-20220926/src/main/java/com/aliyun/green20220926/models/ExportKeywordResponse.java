// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportKeywordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportKeywordResponseBody body;

    public static ExportKeywordResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportKeywordResponse self = new ExportKeywordResponse();
        return TeaModel.build(map, self);
    }

    public ExportKeywordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportKeywordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportKeywordResponse setBody(ExportKeywordResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportKeywordResponseBody getBody() {
        return this.body;
    }

}
