// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeletePipelineTriggerEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePipelineTriggerEventResponseBody body;

    public static DeletePipelineTriggerEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineTriggerEventResponse self = new DeletePipelineTriggerEventResponse();
        return TeaModel.build(map, self);
    }

    public DeletePipelineTriggerEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePipelineTriggerEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePipelineTriggerEventResponse setBody(DeletePipelineTriggerEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePipelineTriggerEventResponseBody getBody() {
        return this.body;
    }

}
