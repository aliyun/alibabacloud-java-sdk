// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PutTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutTargetsResponseBody body;

    public static PutTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        PutTargetsResponse self = new PutTargetsResponse();
        return TeaModel.build(map, self);
    }

    public PutTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutTargetsResponse setBody(PutTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public PutTargetsResponseBody getBody() {
        return this.body;
    }

}
