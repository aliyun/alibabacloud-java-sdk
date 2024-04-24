// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSqlFlashbackTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSqlFlashbackTaskResponseBody body;

    public static SubmitSqlFlashbackTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSqlFlashbackTaskResponse self = new SubmitSqlFlashbackTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSqlFlashbackTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSqlFlashbackTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSqlFlashbackTaskResponse setBody(SubmitSqlFlashbackTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSqlFlashbackTaskResponseBody getBody() {
        return this.body;
    }

}
