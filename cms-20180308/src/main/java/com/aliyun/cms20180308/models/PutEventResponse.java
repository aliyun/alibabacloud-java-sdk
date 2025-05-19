// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class PutEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutEventResponseBody body;

    public static PutEventResponse build(java.util.Map<String, ?> map) throws Exception {
        PutEventResponse self = new PutEventResponse();
        return TeaModel.build(map, self);
    }

    public PutEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutEventResponse setBody(PutEventResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEventResponseBody getBody() {
        return this.body;
    }

}
