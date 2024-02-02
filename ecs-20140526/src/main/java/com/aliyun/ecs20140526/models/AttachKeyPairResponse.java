// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachKeyPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachKeyPairResponseBody body;

    public static AttachKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachKeyPairResponse self = new AttachKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public AttachKeyPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachKeyPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachKeyPairResponse setBody(AttachKeyPairResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachKeyPairResponseBody getBody() {
        return this.body;
    }

}
