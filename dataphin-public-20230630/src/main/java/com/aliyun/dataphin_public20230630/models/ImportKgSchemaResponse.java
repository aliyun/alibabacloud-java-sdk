// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ImportKgSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportKgSchemaResponseBody body;

    public static ImportKgSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportKgSchemaResponse self = new ImportKgSchemaResponse();
        return TeaModel.build(map, self);
    }

    public ImportKgSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportKgSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportKgSchemaResponse setBody(ImportKgSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportKgSchemaResponseBody getBody() {
        return this.body;
    }

}
