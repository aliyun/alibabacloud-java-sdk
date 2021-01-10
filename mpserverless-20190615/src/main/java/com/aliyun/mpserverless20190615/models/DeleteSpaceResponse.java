// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSpaceResponseBody body;

    public static DeleteSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpaceResponse self = new DeleteSpaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSpaceResponse setBody(DeleteSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSpaceResponseBody getBody() {
        return this.body;
    }

}
