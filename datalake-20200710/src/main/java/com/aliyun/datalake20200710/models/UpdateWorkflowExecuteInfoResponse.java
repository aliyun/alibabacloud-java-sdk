// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateWorkflowExecuteInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWorkflowExecuteInfoResponseBody body;

    public static UpdateWorkflowExecuteInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowExecuteInfoResponse self = new UpdateWorkflowExecuteInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowExecuteInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkflowExecuteInfoResponse setBody(UpdateWorkflowExecuteInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkflowExecuteInfoResponseBody getBody() {
        return this.body;
    }

}
