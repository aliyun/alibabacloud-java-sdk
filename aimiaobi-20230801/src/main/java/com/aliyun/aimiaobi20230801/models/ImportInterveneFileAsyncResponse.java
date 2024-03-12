// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ImportInterveneFileAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportInterveneFileAsyncResponseBody body;

    public static ImportInterveneFileAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportInterveneFileAsyncResponse self = new ImportInterveneFileAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ImportInterveneFileAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportInterveneFileAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportInterveneFileAsyncResponse setBody(ImportInterveneFileAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportInterveneFileAsyncResponseBody getBody() {
        return this.body;
    }

}
