// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_device20200120.models;

import com.aliyun.tea.*;

public class ExecuteDeviceRiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteDeviceRiskResponseBody body;

    public static ExecuteDeviceRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDeviceRiskResponse self = new ExecuteDeviceRiskResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteDeviceRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteDeviceRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteDeviceRiskResponse setBody(ExecuteDeviceRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteDeviceRiskResponseBody getBody() {
        return this.body;
    }

}
