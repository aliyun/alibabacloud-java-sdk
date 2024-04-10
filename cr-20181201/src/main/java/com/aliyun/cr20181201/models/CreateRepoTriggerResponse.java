// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateRepoTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRepoTriggerResponse setBody(CreateRepoTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoTriggerResponseBody getBody() {
        return this.body;
    }

}
