// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestStatResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAsyncErrorRequestStatResultResponseBody body;

    public static GetAsyncErrorRequestStatResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestStatResultResponse self = new GetAsyncErrorRequestStatResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestStatResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncErrorRequestStatResultResponse setBody(GetAsyncErrorRequestStatResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsyncErrorRequestStatResultResponseBody getBody() {
        return this.body;
    }

}
