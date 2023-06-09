// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryCostCurveContrastResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCostCurveContrastResponseBody body;

    public static QueryCostCurveContrastResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCurveContrastResponse self = new QueryCostCurveContrastResponse();
        return TeaModel.build(map, self);
    }

    public QueryCostCurveContrastResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCostCurveContrastResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCostCurveContrastResponse setBody(QueryCostCurveContrastResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCostCurveContrastResponseBody getBody() {
        return this.body;
    }

}
