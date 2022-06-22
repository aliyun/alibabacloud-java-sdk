// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryExperimentTaskConsumedAmountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExperimentTaskConsumedAmountResponseBody body;

    public static QueryExperimentTaskConsumedAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentTaskConsumedAmountResponse self = new QueryExperimentTaskConsumedAmountResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentTaskConsumedAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentTaskConsumedAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExperimentTaskConsumedAmountResponse setBody(QueryExperimentTaskConsumedAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentTaskConsumedAmountResponseBody getBody() {
        return this.body;
    }

}
