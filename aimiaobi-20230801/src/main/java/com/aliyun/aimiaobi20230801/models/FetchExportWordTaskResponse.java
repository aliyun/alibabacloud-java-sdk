// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchExportWordTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FetchExportWordTaskResponseBody body;

    public static FetchExportWordTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchExportWordTaskResponse self = new FetchExportWordTaskResponse();
        return TeaModel.build(map, self);
    }

    public FetchExportWordTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchExportWordTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchExportWordTaskResponse setBody(FetchExportWordTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchExportWordTaskResponseBody getBody() {
        return this.body;
    }

}
