// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateRiskNotificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRiskNotificationResponseBody body;

    public static UpdateRiskNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRiskNotificationResponse self = new UpdateRiskNotificationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRiskNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRiskNotificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRiskNotificationResponse setBody(UpdateRiskNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRiskNotificationResponseBody getBody() {
        return this.body;
    }

}
