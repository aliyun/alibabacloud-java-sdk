// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StartTimingSyntheticTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartTimingSyntheticTaskResponseBody body;

    public static StartTimingSyntheticTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTimingSyntheticTaskResponse self = new StartTimingSyntheticTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartTimingSyntheticTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTimingSyntheticTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTimingSyntheticTaskResponse setBody(StartTimingSyntheticTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTimingSyntheticTaskResponseBody getBody() {
        return this.body;
    }

}
