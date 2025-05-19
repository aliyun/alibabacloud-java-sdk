// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class PutEventTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutEventTargetsResponseBody body;

    public static PutEventTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        PutEventTargetsResponse self = new PutEventTargetsResponse();
        return TeaModel.build(map, self);
    }

    public PutEventTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutEventTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutEventTargetsResponse setBody(PutEventTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEventTargetsResponseBody getBody() {
        return this.body;
    }

}
