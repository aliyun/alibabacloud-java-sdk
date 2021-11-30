// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceMirrorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceMirrorResponseBody body;

    public static DeleteServiceMirrorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceMirrorResponse self = new DeleteServiceMirrorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceMirrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceMirrorResponse setBody(DeleteServiceMirrorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceMirrorResponseBody getBody() {
        return this.body;
    }

}
