// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayMaintenancePeriodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayMaintenancePeriodResponseBody body;

    public static UpdateGatewayMaintenancePeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayMaintenancePeriodResponse self = new UpdateGatewayMaintenancePeriodResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayMaintenancePeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayMaintenancePeriodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayMaintenancePeriodResponse setBody(UpdateGatewayMaintenancePeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayMaintenancePeriodResponseBody getBody() {
        return this.body;
    }

}
