// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ImportImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportImageResponseBody body;

    public static ImportImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportImageResponse self = new ImportImageResponse();
        return TeaModel.build(map, self);
    }

    public ImportImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportImageResponse setBody(ImportImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportImageResponseBody getBody() {
        return this.body;
    }

}
