// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteRepoTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteRepoTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRepoTriggerResponse setBody(DeleteRepoTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepoTriggerResponseBody getBody() {
        return this.body;
    }

}
