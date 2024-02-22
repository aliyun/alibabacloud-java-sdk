// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutCustomEventResponseBody body;

    public static PutCustomEventResponse build(java.util.Map<String, ?> map) throws Exception {
        PutCustomEventResponse self = new PutCustomEventResponse();
        return TeaModel.build(map, self);
    }

    public PutCustomEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutCustomEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutCustomEventResponse setBody(PutCustomEventResponseBody body) {
        this.body = body;
        return this;
    }
    public PutCustomEventResponseBody getBody() {
        return this.body;
    }

}
