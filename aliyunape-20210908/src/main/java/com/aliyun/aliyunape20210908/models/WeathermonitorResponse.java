// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeathermonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public WeathermonitorResponseBody body;

    public static WeathermonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        WeathermonitorResponse self = new WeathermonitorResponse();
        return TeaModel.build(map, self);
    }

    public WeathermonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WeathermonitorResponse setBody(WeathermonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public WeathermonitorResponseBody getBody() {
        return this.body;
    }

}
