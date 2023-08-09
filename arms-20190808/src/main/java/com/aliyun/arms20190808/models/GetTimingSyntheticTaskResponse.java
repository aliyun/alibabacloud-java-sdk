// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTimingSyntheticTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTimingSyntheticTaskResponseBody body;

    public static GetTimingSyntheticTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTimingSyntheticTaskResponse self = new GetTimingSyntheticTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTimingSyntheticTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTimingSyntheticTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTimingSyntheticTaskResponse setBody(GetTimingSyntheticTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTimingSyntheticTaskResponseBody getBody() {
        return this.body;
    }

}
