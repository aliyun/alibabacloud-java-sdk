// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryPornPipelineListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPornPipelineListResponseBody body;

    public static QueryPornPipelineListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPornPipelineListResponse self = new QueryPornPipelineListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPornPipelineListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPornPipelineListResponse setBody(QueryPornPipelineListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPornPipelineListResponseBody getBody() {
        return this.body;
    }

}
