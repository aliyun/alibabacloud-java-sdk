// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTerrorismPipelineListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTerrorismPipelineListResponseBody body;

    public static QueryTerrorismPipelineListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTerrorismPipelineListResponse self = new QueryTerrorismPipelineListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTerrorismPipelineListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTerrorismPipelineListResponse setBody(QueryTerrorismPipelineListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTerrorismPipelineListResponseBody getBody() {
        return this.body;
    }

}
