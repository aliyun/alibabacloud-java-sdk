// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoResponseBody body;

    public static GetVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoResponse self = new GetVideoResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoResponse setBody(GetVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoResponseBody getBody() {
        return this.body;
    }

}
