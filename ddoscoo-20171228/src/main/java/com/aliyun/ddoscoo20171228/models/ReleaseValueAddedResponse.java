// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ReleaseValueAddedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseValueAddedResponseBody body;

    public static ReleaseValueAddedResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseValueAddedResponse self = new ReleaseValueAddedResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseValueAddedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseValueAddedResponse setBody(ReleaseValueAddedResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseValueAddedResponseBody getBody() {
        return this.body;
    }

}
