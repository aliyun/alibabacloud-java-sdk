// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryCensorPipelineListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCensorPipelineListResponseBody body;

    public static QueryCensorPipelineListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCensorPipelineListResponse self = new QueryCensorPipelineListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCensorPipelineListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCensorPipelineListResponse setBody(QueryCensorPipelineListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCensorPipelineListResponseBody getBody() {
        return this.body;
    }

}
