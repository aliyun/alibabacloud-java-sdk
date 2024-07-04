// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class UpdateMediaWorkflowTriggerModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaWorkflowTriggerModeResponseBody body;

    public static UpdateMediaWorkflowTriggerModeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaWorkflowTriggerModeResponse self = new UpdateMediaWorkflowTriggerModeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaWorkflowTriggerModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaWorkflowTriggerModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaWorkflowTriggerModeResponse setBody(UpdateMediaWorkflowTriggerModeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaWorkflowTriggerModeResponseBody getBody() {
        return this.body;
    }

}
