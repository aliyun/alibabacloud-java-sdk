// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class RejectUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectUserResponseBody body;

    public static RejectUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectUserResponse self = new RejectUserResponse();
        return TeaModel.build(map, self);
    }

    public RejectUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectUserResponse setBody(RejectUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectUserResponseBody getBody() {
        return this.body;
    }

}
