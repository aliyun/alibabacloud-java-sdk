// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeatherforecastTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public WeatherforecastTimeResponseBody body;

    public static WeatherforecastTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        WeatherforecastTimeResponse self = new WeatherforecastTimeResponse();
        return TeaModel.build(map, self);
    }

    public WeatherforecastTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WeatherforecastTimeResponse setBody(WeatherforecastTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public WeatherforecastTimeResponseBody getBody() {
        return this.body;
    }

}
