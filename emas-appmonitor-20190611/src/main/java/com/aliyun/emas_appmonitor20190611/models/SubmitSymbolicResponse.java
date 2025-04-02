// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class SubmitSymbolicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSymbolicResponseBody body;

    public static SubmitSymbolicResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSymbolicResponse self = new SubmitSymbolicResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSymbolicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSymbolicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSymbolicResponse setBody(SubmitSymbolicResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSymbolicResponseBody getBody() {
        return this.body;
    }

}
