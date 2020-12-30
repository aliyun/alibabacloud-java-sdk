// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetVideoCoverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoCoverResponseBody body;

    public static GetVideoCoverResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCoverResponse self = new GetVideoCoverResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoCoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoCoverResponse setBody(GetVideoCoverResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoCoverResponseBody getBody() {
        return this.body;
    }

}
