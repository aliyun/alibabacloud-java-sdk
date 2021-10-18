// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeatherforecastResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public WeatherforecastResponseBody body;

    public static WeatherforecastResponse build(java.util.Map<String, ?> map) throws Exception {
        WeatherforecastResponse self = new WeatherforecastResponse();
        return TeaModel.build(map, self);
    }

    public WeatherforecastResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WeatherforecastResponse setBody(WeatherforecastResponseBody body) {
        this.body = body;
        return this;
    }
    public WeatherforecastResponseBody getBody() {
        return this.body;
    }

}
