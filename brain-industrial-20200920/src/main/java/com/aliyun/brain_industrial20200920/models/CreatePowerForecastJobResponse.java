// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePowerForecastJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePowerForecastJobResponseBody body;

    public static CreatePowerForecastJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePowerForecastJobResponse self = new CreatePowerForecastJobResponse();
        return TeaModel.build(map, self);
    }

    public CreatePowerForecastJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePowerForecastJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePowerForecastJobResponse setBody(CreatePowerForecastJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePowerForecastJobResponseBody getBody() {
        return this.body;
    }

}
