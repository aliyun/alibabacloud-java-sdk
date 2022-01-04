// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateWorkflowScheduleStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWorkflowScheduleStatusResponseBody body;

    public static UpdateWorkflowScheduleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowScheduleStatusResponse self = new UpdateWorkflowScheduleStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowScheduleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkflowScheduleStatusResponse setBody(UpdateWorkflowScheduleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkflowScheduleStatusResponseBody getBody() {
        return this.body;
    }

}
