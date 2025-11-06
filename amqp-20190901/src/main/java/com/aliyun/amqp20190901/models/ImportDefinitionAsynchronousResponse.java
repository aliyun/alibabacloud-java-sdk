// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ImportDefinitionAsynchronousResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportDefinitionAsynchronousResponseBody body;

    public static ImportDefinitionAsynchronousResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDefinitionAsynchronousResponse self = new ImportDefinitionAsynchronousResponse();
        return TeaModel.build(map, self);
    }

    public ImportDefinitionAsynchronousResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDefinitionAsynchronousResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportDefinitionAsynchronousResponse setBody(ImportDefinitionAsynchronousResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDefinitionAsynchronousResponseBody getBody() {
        return this.body;
    }

}
