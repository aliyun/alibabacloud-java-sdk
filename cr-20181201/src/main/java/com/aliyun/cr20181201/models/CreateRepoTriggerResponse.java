// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRepoTriggerResponseBody body;

    public static CreateRepoTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoTriggerResponse self = new CreateRepoTriggerResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepoTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepoTriggerResponse setBody(CreateRepoTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoTriggerResponseBody getBody() {
        return this.body;
    }

}
