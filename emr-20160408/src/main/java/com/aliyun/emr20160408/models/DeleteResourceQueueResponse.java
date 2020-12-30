// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteResourceQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResourceQueueResponseBody body;

    public static DeleteResourceQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceQueueResponse self = new DeleteResourceQueueResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceQueueResponse setBody(DeleteResourceQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceQueueResponseBody getBody() {
        return this.body;
    }

}
