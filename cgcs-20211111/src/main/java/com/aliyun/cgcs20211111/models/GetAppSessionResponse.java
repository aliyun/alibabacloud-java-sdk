// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppSessionResponseBody body;

    public static GetAppSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppSessionResponse self = new GetAppSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetAppSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppSessionResponse setBody(GetAppSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppSessionResponseBody getBody() {
        return this.body;
    }

}
