// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class GetInstanceTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceTableResponseBody body;

    public static GetInstanceTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTableResponse self = new GetInstanceTableResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceTableResponse setBody(GetInstanceTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceTableResponseBody getBody() {
        return this.body;
    }

}
