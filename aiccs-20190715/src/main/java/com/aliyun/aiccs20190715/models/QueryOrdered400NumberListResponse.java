// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryOrdered400NumberListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrdered400NumberListResponseBody body;

    public static QueryOrdered400NumberListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrdered400NumberListResponse self = new QueryOrdered400NumberListResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrdered400NumberListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrdered400NumberListResponse setBody(QueryOrdered400NumberListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrdered400NumberListResponseBody getBody() {
        return this.body;
    }

}
