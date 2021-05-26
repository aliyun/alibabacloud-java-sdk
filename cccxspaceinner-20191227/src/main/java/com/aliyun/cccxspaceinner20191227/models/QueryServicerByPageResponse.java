// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryServicerByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryServicerByPageResponseBody body;

    public static QueryServicerByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServicerByPageResponse self = new QueryServicerByPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryServicerByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryServicerByPageResponse setBody(QueryServicerByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryServicerByPageResponseBody getBody() {
        return this.body;
    }

}
