// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetScreenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScreenResponseBody body;

    public static GetScreenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScreenResponse self = new GetScreenResponse();
        return TeaModel.build(map, self);
    }

    public GetScreenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScreenResponse setBody(GetScreenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScreenResponseBody getBody() {
        return this.body;
    }

}
