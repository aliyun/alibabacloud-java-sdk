// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeathermonitorProvinceHourResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public WeathermonitorProvinceHourResponseBody body;

    public static WeathermonitorProvinceHourResponse build(java.util.Map<String, ?> map) throws Exception {
        WeathermonitorProvinceHourResponse self = new WeathermonitorProvinceHourResponse();
        return TeaModel.build(map, self);
    }

    public WeathermonitorProvinceHourResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WeathermonitorProvinceHourResponse setBody(WeathermonitorProvinceHourResponseBody body) {
        this.body = body;
        return this;
    }
    public WeathermonitorProvinceHourResponseBody getBody() {
        return this.body;
    }

}
