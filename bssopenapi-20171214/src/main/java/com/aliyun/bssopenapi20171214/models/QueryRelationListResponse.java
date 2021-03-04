// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRelationListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRelationListResponseBody body;

    public static QueryRelationListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRelationListResponse self = new QueryRelationListResponse();
        return TeaModel.build(map, self);
    }

    public QueryRelationListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRelationListResponse setBody(QueryRelationListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRelationListResponseBody getBody() {
        return this.body;
    }

}
