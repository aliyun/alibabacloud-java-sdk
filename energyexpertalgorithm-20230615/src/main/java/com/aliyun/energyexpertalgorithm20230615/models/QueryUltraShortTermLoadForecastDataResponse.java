// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryUltraShortTermLoadForecastDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUltraShortTermLoadForecastDataResponseBody body;

    public static QueryUltraShortTermLoadForecastDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUltraShortTermLoadForecastDataResponse self = new QueryUltraShortTermLoadForecastDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryUltraShortTermLoadForecastDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUltraShortTermLoadForecastDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUltraShortTermLoadForecastDataResponse setBody(QueryUltraShortTermLoadForecastDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUltraShortTermLoadForecastDataResponseBody getBody() {
        return this.body;
    }

}
