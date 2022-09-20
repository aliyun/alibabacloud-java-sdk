// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class DownloadDumpfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadDumpfileResponseBody body;

    public static DownloadDumpfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadDumpfileResponse self = new DownloadDumpfileResponse();
        return TeaModel.build(map, self);
    }

    public DownloadDumpfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadDumpfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadDumpfileResponse setBody(DownloadDumpfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadDumpfileResponseBody getBody() {
        return this.body;
    }

}
