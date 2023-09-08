// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ImportServiceDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportServiceDataResponseBody body;

    public static ImportServiceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportServiceDataResponse self = new ImportServiceDataResponse();
        return TeaModel.build(map, self);
    }

    public ImportServiceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportServiceDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportServiceDataResponse setBody(ImportServiceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportServiceDataResponseBody getBody() {
        return this.body;
    }

}
