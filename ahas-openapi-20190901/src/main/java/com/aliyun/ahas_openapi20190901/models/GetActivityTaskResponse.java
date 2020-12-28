// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetActivityTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetActivityTaskResponseBody body;

    public static GetActivityTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetActivityTaskResponse self = new GetActivityTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetActivityTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetActivityTaskResponse setBody(GetActivityTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetActivityTaskResponseBody getBody() {
        return this.body;
    }

}
