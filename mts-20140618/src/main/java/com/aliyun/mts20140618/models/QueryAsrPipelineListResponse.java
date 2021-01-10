// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAsrPipelineListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAsrPipelineListResponseBody body;

    public static QueryAsrPipelineListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAsrPipelineListResponse self = new QueryAsrPipelineListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAsrPipelineListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAsrPipelineListResponse setBody(QueryAsrPipelineListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAsrPipelineListResponseBody getBody() {
        return this.body;
    }

}
