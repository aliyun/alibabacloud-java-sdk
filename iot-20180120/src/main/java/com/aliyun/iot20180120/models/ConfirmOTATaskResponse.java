// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ConfirmOTATaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmOTATaskResponseBody body;

    public static ConfirmOTATaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmOTATaskResponse self = new ConfirmOTATaskResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmOTATaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmOTATaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmOTATaskResponse setBody(ConfirmOTATaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmOTATaskResponseBody getBody() {
        return this.body;
    }

}
