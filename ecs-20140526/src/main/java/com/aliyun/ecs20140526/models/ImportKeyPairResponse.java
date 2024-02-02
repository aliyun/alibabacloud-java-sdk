// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportKeyPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportKeyPairResponseBody body;

    public static ImportKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyPairResponse self = new ImportKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public ImportKeyPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportKeyPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportKeyPairResponse setBody(ImportKeyPairResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportKeyPairResponseBody getBody() {
        return this.body;
    }

}
