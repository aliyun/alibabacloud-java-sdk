// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class QueryExperimentTaskIdByExpIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExperimentTaskIdByExpIdResponseBody body;

    public static QueryExperimentTaskIdByExpIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentTaskIdByExpIdResponse self = new QueryExperimentTaskIdByExpIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentTaskIdByExpIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentTaskIdByExpIdResponse setBody(QueryExperimentTaskIdByExpIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentTaskIdByExpIdResponseBody getBody() {
        return this.body;
    }

}
