// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePowerForecastByFileUrlJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePowerForecastByFileUrlJobResponseBody body;

    public static CreatePowerForecastByFileUrlJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePowerForecastByFileUrlJobResponse self = new CreatePowerForecastByFileUrlJobResponse();
        return TeaModel.build(map, self);
    }

    public CreatePowerForecastByFileUrlJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePowerForecastByFileUrlJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePowerForecastByFileUrlJobResponse setBody(CreatePowerForecastByFileUrlJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePowerForecastByFileUrlJobResponseBody getBody() {
        return this.body;
    }

}
