// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ImportHttpApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportHttpApiResponseBody body;

    public static ImportHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportHttpApiResponse self = new ImportHttpApiResponse();
        return TeaModel.build(map, self);
    }

    public ImportHttpApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportHttpApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportHttpApiResponse setBody(ImportHttpApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportHttpApiResponseBody getBody() {
        return this.body;
    }

}
