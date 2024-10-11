// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class PushInterventionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushInterventionResponseBody body;

    public static PushInterventionResponse build(java.util.Map<String, ?> map) throws Exception {
        PushInterventionResponse self = new PushInterventionResponse();
        return TeaModel.build(map, self);
    }

    public PushInterventionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushInterventionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushInterventionResponse setBody(PushInterventionResponseBody body) {
        this.body = body;
        return this;
    }
    public PushInterventionResponseBody getBody() {
        return this.body;
    }

}
