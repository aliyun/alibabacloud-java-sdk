// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryExperimentTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExperimentTaskLogResponseBody body;

    public static QueryExperimentTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentTaskLogResponse self = new QueryExperimentTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentTaskLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExperimentTaskLogResponse setBody(QueryExperimentTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentTaskLogResponseBody getBody() {
        return this.body;
    }

}
