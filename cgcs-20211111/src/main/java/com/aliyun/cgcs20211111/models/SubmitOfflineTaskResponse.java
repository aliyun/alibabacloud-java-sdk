// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class SubmitOfflineTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitOfflineTaskResponseBody body;

    public static SubmitOfflineTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitOfflineTaskResponse self = new SubmitOfflineTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitOfflineTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitOfflineTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitOfflineTaskResponse setBody(SubmitOfflineTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitOfflineTaskResponseBody getBody() {
        return this.body;
    }

}
