// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PutPipelineTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PipelineTrigger body;

    public static PutPipelineTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        PutPipelineTriggerResponse self = new PutPipelineTriggerResponse();
        return TeaModel.build(map, self);
    }

    public PutPipelineTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutPipelineTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutPipelineTriggerResponse setBody(PipelineTrigger body) {
        this.body = body;
        return this;
    }
    public PipelineTrigger getBody() {
        return this.body;
    }

}
