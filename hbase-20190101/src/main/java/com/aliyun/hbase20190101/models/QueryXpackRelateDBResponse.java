// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class QueryXpackRelateDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryXpackRelateDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryXpackRelateDBResponse setBody(QueryXpackRelateDBResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryXpackRelateDBResponseBody getBody() {
        return this.body;
    }

}
