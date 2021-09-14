// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetScreenAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScreenAccessResponseBody body;

    public static GetScreenAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScreenAccessResponse self = new GetScreenAccessResponse();
        return TeaModel.build(map, self);
    }

    public GetScreenAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScreenAccessResponse setBody(GetScreenAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScreenAccessResponseBody getBody() {
        return this.body;
    }

}
