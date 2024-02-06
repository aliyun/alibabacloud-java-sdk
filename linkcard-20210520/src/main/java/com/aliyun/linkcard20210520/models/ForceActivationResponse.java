// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ForceActivationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ForceActivationResponseBody body;

    public static ForceActivationResponse build(java.util.Map<String, ?> map) throws Exception {
        ForceActivationResponse self = new ForceActivationResponse();
        return TeaModel.build(map, self);
    }

    public ForceActivationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForceActivationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ForceActivationResponse setBody(ForceActivationResponseBody body) {
        this.body = body;
        return this;
    }
    public ForceActivationResponseBody getBody() {
        return this.body;
    }

}
