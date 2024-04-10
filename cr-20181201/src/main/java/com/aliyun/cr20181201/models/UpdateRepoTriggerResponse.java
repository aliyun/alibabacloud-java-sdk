// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateRepoTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRepoTriggerResponse setBody(UpdateRepoTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRepoTriggerResponseBody getBody() {
        return this.body;
    }

}
