// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTaskFlowNotificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskFlowNotificationResponseBody body;

    public static GetTaskFlowNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskFlowNotificationResponse self = new GetTaskFlowNotificationResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskFlowNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskFlowNotificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskFlowNotificationResponse setBody(GetTaskFlowNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskFlowNotificationResponseBody getBody() {
        return this.body;
    }

}
