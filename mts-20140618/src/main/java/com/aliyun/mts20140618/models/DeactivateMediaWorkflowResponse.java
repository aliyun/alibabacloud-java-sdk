// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeactivateMediaWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeactivateMediaWorkflowResponseBody body;

    public static DeactivateMediaWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactivateMediaWorkflowResponse self = new DeactivateMediaWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public DeactivateMediaWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactivateMediaWorkflowResponse setBody(DeactivateMediaWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactivateMediaWorkflowResponseBody getBody() {
        return this.body;
    }

}
