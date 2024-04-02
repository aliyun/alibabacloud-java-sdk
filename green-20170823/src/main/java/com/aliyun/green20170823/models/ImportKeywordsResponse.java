// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class ImportKeywordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportKeywordsResponseBody body;

    public static ImportKeywordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportKeywordsResponse self = new ImportKeywordsResponse();
        return TeaModel.build(map, self);
    }

    public ImportKeywordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportKeywordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportKeywordsResponse setBody(ImportKeywordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportKeywordsResponseBody getBody() {
        return this.body;
    }

}
