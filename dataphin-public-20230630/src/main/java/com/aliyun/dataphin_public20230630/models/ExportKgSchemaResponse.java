// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExportKgSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportKgSchemaResponseBody body;

    public static ExportKgSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportKgSchemaResponse self = new ExportKgSchemaResponse();
        return TeaModel.build(map, self);
    }

    public ExportKgSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportKgSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportKgSchemaResponse setBody(ExportKgSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportKgSchemaResponseBody getBody() {
        return this.body;
    }

}
