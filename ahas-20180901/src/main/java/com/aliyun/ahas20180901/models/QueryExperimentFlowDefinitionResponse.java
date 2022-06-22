// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryExperimentFlowDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExperimentFlowDefinitionResponseBody body;

    public static QueryExperimentFlowDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentFlowDefinitionResponse self = new QueryExperimentFlowDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentFlowDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentFlowDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExperimentFlowDefinitionResponse setBody(QueryExperimentFlowDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentFlowDefinitionResponseBody getBody() {
        return this.body;
    }

}
