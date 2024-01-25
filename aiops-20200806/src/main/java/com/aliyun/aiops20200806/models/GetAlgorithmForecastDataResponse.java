// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlgorithmForecastDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlgorithmForecastDataResponseBody body;

    public static GetAlgorithmForecastDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmForecastDataResponse self = new GetAlgorithmForecastDataResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmForecastDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmForecastDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlgorithmForecastDataResponse setBody(GetAlgorithmForecastDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmForecastDataResponseBody getBody() {
        return this.body;
    }

}
