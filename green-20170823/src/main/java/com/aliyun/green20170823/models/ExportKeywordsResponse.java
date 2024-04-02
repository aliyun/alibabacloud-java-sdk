// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class ExportKeywordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportKeywordsResponseBody body;

    public static ExportKeywordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportKeywordsResponse self = new ExportKeywordsResponse();
        return TeaModel.build(map, self);
    }

    public ExportKeywordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportKeywordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportKeywordsResponse setBody(ExportKeywordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportKeywordsResponseBody getBody() {
        return this.body;
    }

}
