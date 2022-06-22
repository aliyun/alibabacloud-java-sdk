// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryExperimentTasksResultByExperimentIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExperimentTasksResultByExperimentIdResponseBody body;

    public static QueryExperimentTasksResultByExperimentIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentTasksResultByExperimentIdResponse self = new QueryExperimentTasksResultByExperimentIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentTasksResultByExperimentIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentTasksResultByExperimentIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExperimentTasksResultByExperimentIdResponse setBody(QueryExperimentTasksResultByExperimentIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentTasksResultByExperimentIdResponseBody getBody() {
        return this.body;
    }

}
