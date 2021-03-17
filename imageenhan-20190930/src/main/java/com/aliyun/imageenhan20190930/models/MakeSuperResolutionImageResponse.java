// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class MakeSuperResolutionImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MakeSuperResolutionImageResponseBody body;

    public static MakeSuperResolutionImageResponse build(java.util.Map<String, ?> map) throws Exception {
        MakeSuperResolutionImageResponse self = new MakeSuperResolutionImageResponse();
        return TeaModel.build(map, self);
    }

    public MakeSuperResolutionImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MakeSuperResolutionImageResponse setBody(MakeSuperResolutionImageResponseBody body) {
        this.body = body;
        return this;
    }
    public MakeSuperResolutionImageResponseBody getBody() {
        return this.body;
    }

}
