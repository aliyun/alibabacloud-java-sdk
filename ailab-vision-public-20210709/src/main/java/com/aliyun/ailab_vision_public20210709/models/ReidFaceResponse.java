// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class ReidFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReidFaceResponseBody body;

    public static ReidFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReidFaceResponse self = new ReidFaceResponse();
        return TeaModel.build(map, self);
    }

    public ReidFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReidFaceResponse setBody(ReidFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReidFaceResponseBody getBody() {
        return this.body;
    }

}
