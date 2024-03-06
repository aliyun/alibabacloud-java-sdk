// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ExportDataKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportDataKeyResponseBody body;

    public static ExportDataKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDataKeyResponse self = new ExportDataKeyResponse();
        return TeaModel.build(map, self);
    }

    public ExportDataKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportDataKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportDataKeyResponse setBody(ExportDataKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportDataKeyResponseBody getBody() {
        return this.body;
    }

}
