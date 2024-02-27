// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class CancelVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelVideoTaskResponseBody body;

    public static CancelVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelVideoTaskResponse self = new CancelVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelVideoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelVideoTaskResponse setBody(CancelVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelVideoTaskResponseBody getBody() {
        return this.body;
    }

}
