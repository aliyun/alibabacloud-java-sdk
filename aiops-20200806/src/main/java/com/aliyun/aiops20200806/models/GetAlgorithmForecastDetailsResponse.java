// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlgorithmForecastDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlgorithmForecastDetailsResponseBody body;

    public static GetAlgorithmForecastDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmForecastDetailsResponse self = new GetAlgorithmForecastDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmForecastDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmForecastDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlgorithmForecastDetailsResponse setBody(GetAlgorithmForecastDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmForecastDetailsResponseBody getBody() {
        return this.body;
    }

}
