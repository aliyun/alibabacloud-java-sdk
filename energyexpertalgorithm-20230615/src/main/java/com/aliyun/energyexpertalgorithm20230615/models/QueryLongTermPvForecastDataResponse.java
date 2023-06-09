// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryLongTermPvForecastDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLongTermPvForecastDataResponseBody body;

    public static QueryLongTermPvForecastDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLongTermPvForecastDataResponse self = new QueryLongTermPvForecastDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryLongTermPvForecastDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLongTermPvForecastDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLongTermPvForecastDataResponse setBody(QueryLongTermPvForecastDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLongTermPvForecastDataResponseBody getBody() {
        return this.body;
    }

}
