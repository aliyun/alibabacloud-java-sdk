// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRepoTriggerResponseBody body;

    public static UpdateRepoTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepoTriggerResponse self = new UpdateRepoTriggerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRepoTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRepoTriggerResponse setBody(UpdateRepoTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRepoTriggerResponseBody getBody() {
        return this.body;
    }

}
