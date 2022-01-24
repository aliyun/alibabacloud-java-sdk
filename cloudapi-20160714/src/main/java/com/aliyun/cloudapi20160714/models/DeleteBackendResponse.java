// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteBackendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBackendResponseBody body;

    public static DeleteBackendResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackendResponse self = new DeleteBackendResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackendResponse setBody(DeleteBackendResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackendResponseBody getBody() {
        return this.body;
    }

}
