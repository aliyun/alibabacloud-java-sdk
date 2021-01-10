// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ActivateMediaWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActivateMediaWorkflowResponseBody body;

    public static ActivateMediaWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateMediaWorkflowResponse self = new ActivateMediaWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public ActivateMediaWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateMediaWorkflowResponse setBody(ActivateMediaWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateMediaWorkflowResponseBody getBody() {
        return this.body;
    }

}
