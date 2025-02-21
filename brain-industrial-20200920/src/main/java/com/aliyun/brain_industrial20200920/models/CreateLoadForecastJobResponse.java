// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreateLoadForecastJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLoadForecastJobResponseBody body;

    public static CreateLoadForecastJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadForecastJobResponse self = new CreateLoadForecastJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoadForecastJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLoadForecastJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLoadForecastJobResponse setBody(CreateLoadForecastJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLoadForecastJobResponseBody getBody() {
        return this.body;
    }

}
