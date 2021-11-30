// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceMirrorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServiceMirrorResponseBody body;

    public static UpdateServiceMirrorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceMirrorResponse self = new UpdateServiceMirrorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceMirrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceMirrorResponse setBody(UpdateServiceMirrorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceMirrorResponseBody getBody() {
        return this.body;
    }

}
