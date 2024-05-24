// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeletePipelineTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePipelineTriggerResponseBody body;

    public static DeletePipelineTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineTriggerResponse self = new DeletePipelineTriggerResponse();
        return TeaModel.build(map, self);
    }

    public DeletePipelineTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePipelineTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePipelineTriggerResponse setBody(DeletePipelineTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePipelineTriggerResponseBody getBody() {
        return this.body;
    }

}
