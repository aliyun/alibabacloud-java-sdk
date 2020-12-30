// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteRepoTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRepoTriggerResponseBody body;

    public static DeleteRepoTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepoTriggerResponse self = new DeleteRepoTriggerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepoTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepoTriggerResponse setBody(DeleteRepoTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepoTriggerResponseBody getBody() {
        return this.body;
    }

}
