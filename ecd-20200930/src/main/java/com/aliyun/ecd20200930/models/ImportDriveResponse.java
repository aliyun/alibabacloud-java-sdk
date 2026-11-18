// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ImportDriveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportDriveResponseBody body;

    public static ImportDriveResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDriveResponse self = new ImportDriveResponse();
        return TeaModel.build(map, self);
    }

    public ImportDriveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDriveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportDriveResponse setBody(ImportDriveResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDriveResponseBody getBody() {
        return this.body;
    }

}
