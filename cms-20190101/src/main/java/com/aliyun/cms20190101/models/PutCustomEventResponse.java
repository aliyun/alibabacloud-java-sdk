// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PutCustomEventResponse setBody(PutCustomEventResponseBody body) {
        this.body = body;
        return this;
    }
    public PutCustomEventResponseBody getBody() {
        return this.body;
    }

}
