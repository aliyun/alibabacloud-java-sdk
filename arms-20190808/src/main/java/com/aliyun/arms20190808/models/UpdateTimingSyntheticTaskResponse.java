// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateTimingSyntheticTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTimingSyntheticTaskResponseBody body;

    public static UpdateTimingSyntheticTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTimingSyntheticTaskResponse self = new UpdateTimingSyntheticTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTimingSyntheticTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTimingSyntheticTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTimingSyntheticTaskResponse setBody(UpdateTimingSyntheticTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTimingSyntheticTaskResponseBody getBody() {
        return this.body;
    }

}
