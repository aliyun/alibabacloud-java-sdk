// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCinemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAllCinemasResponseBody body;

    public static QueryAllCinemasResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCinemasResponse self = new QueryAllCinemasResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllCinemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAllCinemasResponse setBody(QueryAllCinemasResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllCinemasResponseBody getBody() {
        return this.body;
    }

}
