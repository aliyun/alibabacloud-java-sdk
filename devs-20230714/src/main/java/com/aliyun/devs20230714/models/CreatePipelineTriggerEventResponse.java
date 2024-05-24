// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CreatePipelineTriggerEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PipelineTriggerEvent body;

    public static CreatePipelineTriggerEventResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineTriggerEventResponse self = new CreatePipelineTriggerEventResponse();
        return TeaModel.build(map, self);
    }

    public CreatePipelineTriggerEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePipelineTriggerEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePipelineTriggerEventResponse setBody(PipelineTriggerEvent body) {
        this.body = body;
        return this;
    }
    public PipelineTriggerEvent getBody() {
        return this.body;
    }

}
