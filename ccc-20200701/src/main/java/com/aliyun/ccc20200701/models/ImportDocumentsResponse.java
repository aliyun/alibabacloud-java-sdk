// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportDocumentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportDocumentsResponseBody body;

    public static ImportDocumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDocumentsResponse self = new ImportDocumentsResponse();
        return TeaModel.build(map, self);
    }

    public ImportDocumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDocumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportDocumentsResponse setBody(ImportDocumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDocumentsResponseBody getBody() {
        return this.body;
    }

}
