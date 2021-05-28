// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class GetTraceAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTraceAppResponseBody body;

    public static GetTraceAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraceAppResponse self = new GetTraceAppResponse();
        return TeaModel.build(map, self);
    }

    public GetTraceAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTraceAppResponse setBody(GetTraceAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTraceAppResponseBody getBody() {
        return this.body;
    }

}
