// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteUpstreamAppServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUpstreamAppServerResponseBody body;

    public static DeleteUpstreamAppServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUpstreamAppServerResponse self = new DeleteUpstreamAppServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUpstreamAppServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUpstreamAppServerResponse setBody(DeleteUpstreamAppServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUpstreamAppServerResponseBody getBody() {
        return this.body;
    }

}
