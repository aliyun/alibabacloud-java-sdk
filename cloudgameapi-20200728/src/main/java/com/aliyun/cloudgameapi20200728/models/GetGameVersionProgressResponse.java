// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameVersionProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGameVersionProgressResponseBody body;

    public static GetGameVersionProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameVersionProgressResponse self = new GetGameVersionProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetGameVersionProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGameVersionProgressResponse setBody(GetGameVersionProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGameVersionProgressResponseBody getBody() {
        return this.body;
    }

}
