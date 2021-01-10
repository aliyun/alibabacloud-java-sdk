// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteProjectAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProjectAppResponseBody body;

    public static DeleteProjectAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectAppResponse self = new DeleteProjectAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProjectAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProjectAppResponse setBody(DeleteProjectAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProjectAppResponseBody getBody() {
        return this.body;
    }

}
