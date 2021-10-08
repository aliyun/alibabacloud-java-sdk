// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventTrentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEventTrentResponseBody body;

    public static GetEventTrentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventTrentResponse self = new GetEventTrentResponse();
        return TeaModel.build(map, self);
    }

    public GetEventTrentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventTrentResponse setBody(GetEventTrentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventTrentResponseBody getBody() {
        return this.body;
    }

}
