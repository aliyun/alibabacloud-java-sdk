// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ResetThingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetThingResponseBody body;

    public static ResetThingResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetThingResponse self = new ResetThingResponse();
        return TeaModel.build(map, self);
    }

    public ResetThingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetThingResponse setBody(ResetThingResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetThingResponseBody getBody() {
        return this.body;
    }

}
