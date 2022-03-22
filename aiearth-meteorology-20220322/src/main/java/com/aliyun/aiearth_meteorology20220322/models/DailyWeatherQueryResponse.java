// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20220322.models;

import com.aliyun.tea.*;

public class DailyWeatherQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DailyWeatherQueryResponseBody body;

    public static DailyWeatherQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        DailyWeatherQueryResponse self = new DailyWeatherQueryResponse();
        return TeaModel.build(map, self);
    }

    public DailyWeatherQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DailyWeatherQueryResponse setBody(DailyWeatherQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public DailyWeatherQueryResponseBody getBody() {
        return this.body;
    }

}
