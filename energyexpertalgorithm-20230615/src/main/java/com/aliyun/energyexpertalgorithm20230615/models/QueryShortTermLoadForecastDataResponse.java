// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryShortTermLoadForecastDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryShortTermLoadForecastDataResponseBody body;

    public static QueryShortTermLoadForecastDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryShortTermLoadForecastDataResponse self = new QueryShortTermLoadForecastDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryShortTermLoadForecastDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryShortTermLoadForecastDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryShortTermLoadForecastDataResponse setBody(QueryShortTermLoadForecastDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryShortTermLoadForecastDataResponseBody getBody() {
        return this.body;
    }

}
