// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class FileAsyncScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FileAsyncScanResponseBody body;

    public static FileAsyncScanResponse build(java.util.Map<String, ?> map) throws Exception {
        FileAsyncScanResponse self = new FileAsyncScanResponse();
        return TeaModel.build(map, self);
    }

    public FileAsyncScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FileAsyncScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FileAsyncScanResponse setBody(FileAsyncScanResponseBody body) {
        this.body = body;
        return this;
    }
    public FileAsyncScanResponseBody getBody() {
        return this.body;
    }

}
