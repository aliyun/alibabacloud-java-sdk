// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class EnableThingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableThingResponseBody body;

    public static EnableThingResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableThingResponse self = new EnableThingResponse();
        return TeaModel.build(map, self);
    }

    public EnableThingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableThingResponse setBody(EnableThingResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableThingResponseBody getBody() {
        return this.body;
    }

}
