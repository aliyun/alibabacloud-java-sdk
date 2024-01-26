// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StopTimingSyntheticTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopTimingSyntheticTaskResponseBody body;

    public static StopTimingSyntheticTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTimingSyntheticTaskResponse self = new StopTimingSyntheticTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopTimingSyntheticTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTimingSyntheticTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTimingSyntheticTaskResponse setBody(StopTimingSyntheticTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTimingSyntheticTaskResponseBody getBody() {
        return this.body;
    }

}
