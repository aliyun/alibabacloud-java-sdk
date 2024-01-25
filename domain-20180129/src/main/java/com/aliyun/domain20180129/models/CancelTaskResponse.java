// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelTaskResponseBody body;

    public static CancelTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelTaskResponse self = new CancelTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelTaskResponse setBody(CancelTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelTaskResponseBody getBody() {
        return this.body;
    }

}
