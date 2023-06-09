// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryShortTermPvForecastDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryShortTermPvForecastDataResponseBody body;

    public static QueryShortTermPvForecastDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryShortTermPvForecastDataResponse self = new QueryShortTermPvForecastDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryShortTermPvForecastDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryShortTermPvForecastDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryShortTermPvForecastDataResponse setBody(QueryShortTermPvForecastDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryShortTermPvForecastDataResponseBody getBody() {
        return this.body;
    }

}
