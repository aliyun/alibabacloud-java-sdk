// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryAiccsInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAiccsInstanceListResponseBody body;

    public static QueryAiccsInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAiccsInstanceListResponse self = new QueryAiccsInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAiccsInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAiccsInstanceListResponse setBody(QueryAiccsInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAiccsInstanceListResponseBody getBody() {
        return this.body;
    }

}
