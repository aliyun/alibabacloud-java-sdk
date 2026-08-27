// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetRiskNotificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRiskNotificationResponseBody body;

    public static GetRiskNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskNotificationResponse self = new GetRiskNotificationResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskNotificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRiskNotificationResponse setBody(GetRiskNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskNotificationResponseBody getBody() {
        return this.body;
    }

}
