// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AttachCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachCenResponseBody body;

    public static AttachCenResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachCenResponse self = new AttachCenResponse();
        return TeaModel.build(map, self);
    }

    public AttachCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachCenResponse setBody(AttachCenResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachCenResponseBody getBody() {
        return this.body;
    }

}
