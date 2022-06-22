// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryExperimentTasksByExperimentIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExperimentTasksByExperimentIdResponseBody body;

    public static QueryExperimentTasksByExperimentIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentTasksByExperimentIdResponse self = new QueryExperimentTasksByExperimentIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentTasksByExperimentIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentTasksByExperimentIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExperimentTasksByExperimentIdResponse setBody(QueryExperimentTasksByExperimentIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentTasksByExperimentIdResponseBody getBody() {
        return this.body;
    }

}
