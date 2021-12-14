// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryAllAccountListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAllAccountListResponseBody body;

    public static QueryAllAccountListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllAccountListResponse self = new QueryAllAccountListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllAccountListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAllAccountListResponse setBody(QueryAllAccountListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllAccountListResponseBody getBody() {
        return this.body;
    }

}
