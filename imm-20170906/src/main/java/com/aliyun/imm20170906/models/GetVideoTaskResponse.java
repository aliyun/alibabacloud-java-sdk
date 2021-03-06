// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoTaskResponseBody body;

    public static GetVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTaskResponse self = new GetVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoTaskResponse setBody(GetVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoTaskResponseBody getBody() {
        return this.body;
    }

}
