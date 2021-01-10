// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryPipelineListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPipelineListResponseBody body;

    public static QueryPipelineListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPipelineListResponse self = new QueryPipelineListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPipelineListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPipelineListResponse setBody(QueryPipelineListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPipelineListResponseBody getBody() {
        return this.body;
    }

}
