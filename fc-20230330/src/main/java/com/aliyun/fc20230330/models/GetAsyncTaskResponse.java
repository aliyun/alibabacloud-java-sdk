// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AsyncTask body;

    public static GetAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTaskResponse self = new GetAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsyncTaskResponse setBody(AsyncTask body) {
        this.body = body;
        return this;
    }
    public AsyncTask getBody() {
        return this.body;
    }

}
