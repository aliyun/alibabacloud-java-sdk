// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskFlowScheduleResponseBody body;

    public static UpdateTaskFlowScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowScheduleResponse self = new UpdateTaskFlowScheduleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskFlowScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskFlowScheduleResponse setBody(UpdateTaskFlowScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskFlowScheduleResponseBody getBody() {
        return this.body;
    }

}
