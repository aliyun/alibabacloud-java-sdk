// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaWorkflowTriggerModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateMediaWorkflowTriggerModeResponse setBody(UpdateMediaWorkflowTriggerModeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaWorkflowTriggerModeResponseBody getBody() {
        return this.body;
    }

}
