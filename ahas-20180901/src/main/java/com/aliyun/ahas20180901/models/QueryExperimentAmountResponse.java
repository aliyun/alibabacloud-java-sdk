// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryExperimentAmountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExperimentAmountResponseBody body;

    public static QueryExperimentAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentAmountResponse self = new QueryExperimentAmountResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExperimentAmountResponse setBody(QueryExperimentAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentAmountResponseBody getBody() {
        return this.body;
    }

}
