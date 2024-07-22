// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class StopProjectTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopProjectTaskResponseBody body;

    public static StopProjectTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopProjectTaskResponse self = new StopProjectTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopProjectTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopProjectTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopProjectTaskResponse setBody(StopProjectTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopProjectTaskResponseBody getBody() {
        return this.body;
    }

}
