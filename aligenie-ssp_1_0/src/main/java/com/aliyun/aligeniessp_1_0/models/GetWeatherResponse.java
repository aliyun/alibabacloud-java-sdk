// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetWeatherResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetWeatherResponseBody body;

    public static GetWeatherResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWeatherResponse self = new GetWeatherResponse();
        return TeaModel.build(map, self);
    }

    public GetWeatherResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWeatherResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWeatherResponse setBody(GetWeatherResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWeatherResponseBody getBody() {
        return this.body;
    }

}
