// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateAndExportDataKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateAndExportDataKeyResponseBody body;

    public static GenerateAndExportDataKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAndExportDataKeyResponse self = new GenerateAndExportDataKeyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAndExportDataKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAndExportDataKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAndExportDataKeyResponse setBody(GenerateAndExportDataKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAndExportDataKeyResponseBody getBody() {
        return this.body;
    }

}
