// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteDegradeControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDegradeControlResponseBody body;

    public static DeleteDegradeControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDegradeControlResponse self = new DeleteDegradeControlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDegradeControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDegradeControlResponse setBody(DeleteDegradeControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDegradeControlResponseBody getBody() {
        return this.body;
    }

}
