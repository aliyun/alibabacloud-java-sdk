// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class QueryExperimentSimpleInfoForMkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExperimentSimpleInfoForMkResponseBody body;

    public static QueryExperimentSimpleInfoForMkResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentSimpleInfoForMkResponse self = new QueryExperimentSimpleInfoForMkResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentSimpleInfoForMkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentSimpleInfoForMkResponse setBody(QueryExperimentSimpleInfoForMkResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentSimpleInfoForMkResponseBody getBody() {
        return this.body;
    }

}
