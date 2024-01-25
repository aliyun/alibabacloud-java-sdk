// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportSwaggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportSwaggerResponseBody body;

    public static ImportSwaggerResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportSwaggerResponse self = new ImportSwaggerResponse();
        return TeaModel.build(map, self);
    }

    public ImportSwaggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportSwaggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportSwaggerResponse setBody(ImportSwaggerResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportSwaggerResponseBody getBody() {
        return this.body;
    }

}
