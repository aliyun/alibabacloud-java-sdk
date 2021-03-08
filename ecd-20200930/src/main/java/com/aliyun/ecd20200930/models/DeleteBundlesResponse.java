// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteBundlesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBundlesResponseBody body;

    public static DeleteBundlesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBundlesResponse self = new DeleteBundlesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBundlesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBundlesResponse setBody(DeleteBundlesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBundlesResponseBody getBody() {
        return this.body;
    }

}
