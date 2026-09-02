// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class EcomVideoRecreationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EcomVideoRecreationResponseBody body;

    public static EcomVideoRecreationResponse build(java.util.Map<String, ?> map) throws Exception {
        EcomVideoRecreationResponse self = new EcomVideoRecreationResponse();
        return TeaModel.build(map, self);
    }

    public EcomVideoRecreationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EcomVideoRecreationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EcomVideoRecreationResponse setBody(EcomVideoRecreationResponseBody body) {
        this.body = body;
        return this;
    }
    public EcomVideoRecreationResponseBody getBody() {
        return this.body;
    }

}
