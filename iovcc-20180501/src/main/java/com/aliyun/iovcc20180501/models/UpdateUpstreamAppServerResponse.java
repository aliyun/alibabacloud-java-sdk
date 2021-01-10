// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateUpstreamAppServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUpstreamAppServerResponseBody body;

    public static UpdateUpstreamAppServerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUpstreamAppServerResponse self = new UpdateUpstreamAppServerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUpstreamAppServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUpstreamAppServerResponse setBody(UpdateUpstreamAppServerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUpstreamAppServerResponseBody getBody() {
        return this.body;
    }

}
