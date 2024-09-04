// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class FileAsyncScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FileAsyncScanResultsResponseBody body;

    public static FileAsyncScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        FileAsyncScanResultsResponse self = new FileAsyncScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public FileAsyncScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FileAsyncScanResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FileAsyncScanResultsResponse setBody(FileAsyncScanResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public FileAsyncScanResultsResponseBody getBody() {
        return this.body;
    }

}
