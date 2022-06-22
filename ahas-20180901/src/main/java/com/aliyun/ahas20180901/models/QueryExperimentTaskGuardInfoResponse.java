// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryExperimentTaskGuardInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExperimentTaskGuardInfoResponseBody body;

    public static QueryExperimentTaskGuardInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentTaskGuardInfoResponse self = new QueryExperimentTaskGuardInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentTaskGuardInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentTaskGuardInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExperimentTaskGuardInfoResponse setBody(QueryExperimentTaskGuardInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentTaskGuardInfoResponseBody getBody() {
        return this.body;
    }

}
