// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTraceResponseBody body;

    public static GetTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraceResponse self = new GetTraceResponse();
        return TeaModel.build(map, self);
    }

    public GetTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTraceResponse setBody(GetTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTraceResponseBody getBody() {
        return this.body;
    }

}
