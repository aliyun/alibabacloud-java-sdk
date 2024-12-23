// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMmsAsyncTaskResponseBody body;

    public static GetMmsAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMmsAsyncTaskResponse self = new GetMmsAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetMmsAsyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMmsAsyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMmsAsyncTaskResponse setBody(GetMmsAsyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMmsAsyncTaskResponseBody getBody() {
        return this.body;
    }

}
