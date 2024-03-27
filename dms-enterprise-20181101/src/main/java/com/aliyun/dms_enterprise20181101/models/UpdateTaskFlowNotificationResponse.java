// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowNotificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskFlowNotificationResponseBody body;

    public static UpdateTaskFlowNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowNotificationResponse self = new UpdateTaskFlowNotificationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskFlowNotificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskFlowNotificationResponse setBody(UpdateTaskFlowNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskFlowNotificationResponseBody getBody() {
        return this.body;
    }

}
