// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class QueryExperimentsByEmpIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExperimentsByEmpIdResponseBody body;

    public static QueryExperimentsByEmpIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentsByEmpIdResponse self = new QueryExperimentsByEmpIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentsByEmpIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentsByEmpIdResponse setBody(QueryExperimentsByEmpIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentsByEmpIdResponseBody getBody() {
        return this.body;
    }

}
