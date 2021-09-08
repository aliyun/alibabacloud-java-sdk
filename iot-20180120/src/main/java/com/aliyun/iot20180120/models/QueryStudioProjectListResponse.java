// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioProjectListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryStudioProjectListResponseBody body;

    public static QueryStudioProjectListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioProjectListResponse self = new QueryStudioProjectListResponse();
        return TeaModel.build(map, self);
    }

    public QueryStudioProjectListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStudioProjectListResponse setBody(QueryStudioProjectListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStudioProjectListResponseBody getBody() {
        return this.body;
    }

}
