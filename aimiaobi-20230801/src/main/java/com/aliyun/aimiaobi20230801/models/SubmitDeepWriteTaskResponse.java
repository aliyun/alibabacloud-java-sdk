// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitDeepWriteTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDeepWriteTaskResponseBody body;

    public static SubmitDeepWriteTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDeepWriteTaskResponse self = new SubmitDeepWriteTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDeepWriteTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDeepWriteTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDeepWriteTaskResponse setBody(SubmitDeepWriteTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDeepWriteTaskResponseBody getBody() {
        return this.body;
    }

}
