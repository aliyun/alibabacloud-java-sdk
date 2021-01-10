// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryEditingJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEditingJobListResponseBody body;

    public static QueryEditingJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEditingJobListResponse self = new QueryEditingJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryEditingJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEditingJobListResponse setBody(QueryEditingJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEditingJobListResponseBody getBody() {
        return this.body;
    }

}
