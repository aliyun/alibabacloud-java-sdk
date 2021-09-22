// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class AttrFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttrFaceResponseBody body;

    public static AttrFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        AttrFaceResponse self = new AttrFaceResponse();
        return TeaModel.build(map, self);
    }

    public AttrFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttrFaceResponse setBody(AttrFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public AttrFaceResponseBody getBody() {
        return this.body;
    }

}
