// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CancelDeepWriteTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelDeepWriteTaskResponseBody body;

    public static CancelDeepWriteTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDeepWriteTaskResponse self = new CancelDeepWriteTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelDeepWriteTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDeepWriteTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelDeepWriteTaskResponse setBody(CancelDeepWriteTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDeepWriteTaskResponseBody getBody() {
        return this.body;
    }

}
