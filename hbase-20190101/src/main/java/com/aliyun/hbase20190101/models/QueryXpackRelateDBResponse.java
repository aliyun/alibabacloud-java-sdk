// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class QueryXpackRelateDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryXpackRelateDBResponseBody body;

    public static QueryXpackRelateDBResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryXpackRelateDBResponse self = new QueryXpackRelateDBResponse();
        return TeaModel.build(map, self);
    }

    public QueryXpackRelateDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryXpackRelateDBResponse setBody(QueryXpackRelateDBResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryXpackRelateDBResponseBody getBody() {
        return this.body;
    }

}
