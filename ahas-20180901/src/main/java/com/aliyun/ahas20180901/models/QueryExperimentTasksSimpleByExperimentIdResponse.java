// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryExperimentTasksSimpleByExperimentIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExperimentTasksSimpleByExperimentIdResponseBody body;

    public static QueryExperimentTasksSimpleByExperimentIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentTasksSimpleByExperimentIdResponse self = new QueryExperimentTasksSimpleByExperimentIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentTasksSimpleByExperimentIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentTasksSimpleByExperimentIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExperimentTasksSimpleByExperimentIdResponse setBody(QueryExperimentTasksSimpleByExperimentIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentTasksSimpleByExperimentIdResponseBody getBody() {
        return this.body;
    }

}
