// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateScanSbomExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScanSbomExportResponseBody body;

    public static CreateScanSbomExportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScanSbomExportResponse self = new CreateScanSbomExportResponse();
        return TeaModel.build(map, self);
    }

    public CreateScanSbomExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScanSbomExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScanSbomExportResponse setBody(CreateScanSbomExportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScanSbomExportResponseBody getBody() {
        return this.body;
    }

}
