// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreateLoadForecastByFileUrlJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLoadForecastByFileUrlJobResponseBody body;

    public static CreateLoadForecastByFileUrlJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadForecastByFileUrlJobResponse self = new CreateLoadForecastByFileUrlJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoadForecastByFileUrlJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLoadForecastByFileUrlJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLoadForecastByFileUrlJobResponse setBody(CreateLoadForecastByFileUrlJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLoadForecastByFileUrlJobResponseBody getBody() {
        return this.body;
    }

}
