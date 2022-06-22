// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ForecastExperimentAmountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ForecastExperimentAmountResponseBody body;

    public static ForecastExperimentAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        ForecastExperimentAmountResponse self = new ForecastExperimentAmountResponse();
        return TeaModel.build(map, self);
    }

    public ForecastExperimentAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForecastExperimentAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ForecastExperimentAmountResponse setBody(ForecastExperimentAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public ForecastExperimentAmountResponseBody getBody() {
        return this.body;
    }

}
