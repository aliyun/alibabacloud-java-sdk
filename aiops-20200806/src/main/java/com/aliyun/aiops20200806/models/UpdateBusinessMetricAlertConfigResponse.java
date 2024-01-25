// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateBusinessMetricAlertConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBusinessMetricAlertConfigResponseBody body;

    public static UpdateBusinessMetricAlertConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessMetricAlertConfigResponse self = new UpdateBusinessMetricAlertConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessMetricAlertConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBusinessMetricAlertConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBusinessMetricAlertConfigResponse setBody(UpdateBusinessMetricAlertConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBusinessMetricAlertConfigResponseBody getBody() {
        return this.body;
    }

}
