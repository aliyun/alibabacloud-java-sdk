// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class RetryDownloadTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryDownloadTaskResponseBody body;

    public static RetryDownloadTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryDownloadTaskResponse self = new RetryDownloadTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryDownloadTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryDownloadTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryDownloadTaskResponse setBody(RetryDownloadTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryDownloadTaskResponseBody getBody() {
        return this.body;
    }

}
