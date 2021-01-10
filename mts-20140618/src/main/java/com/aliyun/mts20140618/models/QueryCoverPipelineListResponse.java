// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryCoverPipelineListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCoverPipelineListResponseBody body;

    public static QueryCoverPipelineListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCoverPipelineListResponse self = new QueryCoverPipelineListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCoverPipelineListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCoverPipelineListResponse setBody(QueryCoverPipelineListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCoverPipelineListResponseBody getBody() {
        return this.body;
    }

}
