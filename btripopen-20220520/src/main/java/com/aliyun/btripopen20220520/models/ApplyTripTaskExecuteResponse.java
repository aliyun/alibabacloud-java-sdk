// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyTripTaskExecuteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyTripTaskExecuteResponseBody body;

    public static ApplyTripTaskExecuteResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyTripTaskExecuteResponse self = new ApplyTripTaskExecuteResponse();
        return TeaModel.build(map, self);
    }

    public ApplyTripTaskExecuteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyTripTaskExecuteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyTripTaskExecuteResponse setBody(ApplyTripTaskExecuteResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyTripTaskExecuteResponseBody getBody() {
        return this.body;
    }

}
