// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class ReidBodyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReidBodyResponseBody body;

    public static ReidBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        ReidBodyResponse self = new ReidBodyResponse();
        return TeaModel.build(map, self);
    }

    public ReidBodyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReidBodyResponse setBody(ReidBodyResponseBody body) {
        this.body = body;
        return this;
    }
    public ReidBodyResponseBody getBody() {
        return this.body;
    }

}
