// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchImageTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FetchImageTaskResponseBody body;

    public static FetchImageTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchImageTaskResponse self = new FetchImageTaskResponse();
        return TeaModel.build(map, self);
    }

    public FetchImageTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchImageTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchImageTaskResponse setBody(FetchImageTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchImageTaskResponseBody getBody() {
        return this.body;
    }

}
