// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CloseEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseEventResponseBody body;

    public static CloseEventResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseEventResponse self = new CloseEventResponse();
        return TeaModel.build(map, self);
    }

    public CloseEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseEventResponse setBody(CloseEventResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseEventResponseBody getBody() {
        return this.body;
    }

}
