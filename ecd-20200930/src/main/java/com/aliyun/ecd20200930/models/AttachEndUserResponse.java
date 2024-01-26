// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AttachEndUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachEndUserResponseBody body;

    public static AttachEndUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachEndUserResponse self = new AttachEndUserResponse();
        return TeaModel.build(map, self);
    }

    public AttachEndUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachEndUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachEndUserResponse setBody(AttachEndUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachEndUserResponseBody getBody() {
        return this.body;
    }

}
