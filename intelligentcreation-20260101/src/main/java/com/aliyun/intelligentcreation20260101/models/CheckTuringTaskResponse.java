// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20260101.models;

import com.aliyun.tea.*;

public class CheckTuringTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckTuringTaskResponseBody body;

    public static CheckTuringTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckTuringTaskResponse self = new CheckTuringTaskResponse();
        return TeaModel.build(map, self);
    }

    public CheckTuringTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckTuringTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckTuringTaskResponse setBody(CheckTuringTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckTuringTaskResponseBody getBody() {
        return this.body;
    }

}
