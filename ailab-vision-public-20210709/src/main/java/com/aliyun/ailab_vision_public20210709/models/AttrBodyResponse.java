// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class AttrBodyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttrBodyResponseBody body;

    public static AttrBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        AttrBodyResponse self = new AttrBodyResponse();
        return TeaModel.build(map, self);
    }

    public AttrBodyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttrBodyResponse setBody(AttrBodyResponseBody body) {
        this.body = body;
        return this;
    }
    public AttrBodyResponseBody getBody() {
        return this.body;
    }

}
