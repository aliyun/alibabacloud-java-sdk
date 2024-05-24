// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class UpdatePipelineTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PipelineTrigger body;

    public static UpdatePipelineTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineTriggerResponse self = new UpdatePipelineTriggerResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePipelineTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePipelineTriggerResponse setBody(PipelineTrigger body) {
        this.body = body;
        return this;
    }
    public PipelineTrigger getBody() {
        return this.body;
    }

}
