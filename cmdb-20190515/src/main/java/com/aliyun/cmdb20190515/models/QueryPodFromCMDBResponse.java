// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class QueryPodFromCMDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPodFromCMDBResponseBody body;

    public static QueryPodFromCMDBResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPodFromCMDBResponse self = new QueryPodFromCMDBResponse();
        return TeaModel.build(map, self);
    }

    public QueryPodFromCMDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPodFromCMDBResponse setBody(QueryPodFromCMDBResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPodFromCMDBResponseBody getBody() {
        return this.body;
    }

}
