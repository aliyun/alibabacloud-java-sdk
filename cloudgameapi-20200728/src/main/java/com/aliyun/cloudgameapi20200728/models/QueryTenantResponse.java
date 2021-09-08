// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryTenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTenantResponseBody body;

    public static QueryTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantResponse self = new QueryTenantResponse();
        return TeaModel.build(map, self);
    }

    public QueryTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTenantResponse setBody(QueryTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTenantResponseBody getBody() {
        return this.body;
    }

}
