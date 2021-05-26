// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryAllCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAllCategoryResponseBody body;

    public static QueryAllCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCategoryResponse self = new QueryAllCategoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAllCategoryResponse setBody(QueryAllCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllCategoryResponseBody getBody() {
        return this.body;
    }

}
