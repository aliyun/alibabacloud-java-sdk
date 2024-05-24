// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GetPipelineTriggerEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PipelineTriggerEvent body;

    public static GetPipelineTriggerEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineTriggerEventResponse self = new GetPipelineTriggerEventResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineTriggerEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineTriggerEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPipelineTriggerEventResponse setBody(PipelineTriggerEvent body) {
        this.body = body;
        return this;
    }
    public PipelineTriggerEvent getBody() {
        return this.body;
    }

}
