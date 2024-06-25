// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AttachToPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachToPolicyResponseBody body;

    public static AttachToPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachToPolicyResponse self = new AttachToPolicyResponse();
        return TeaModel.build(map, self);
    }

    public AttachToPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachToPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachToPolicyResponse setBody(AttachToPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachToPolicyResponseBody getBody() {
        return this.body;
    }

}
