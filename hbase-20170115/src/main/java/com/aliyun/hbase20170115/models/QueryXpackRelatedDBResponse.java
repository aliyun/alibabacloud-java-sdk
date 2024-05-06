// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class QueryXpackRelatedDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryXpackRelatedDBResponseBody body;

    public static QueryXpackRelatedDBResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryXpackRelatedDBResponse self = new QueryXpackRelatedDBResponse();
        return TeaModel.build(map, self);
    }

    public QueryXpackRelatedDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryXpackRelatedDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryXpackRelatedDBResponse setBody(QueryXpackRelatedDBResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryXpackRelatedDBResponseBody getBody() {
        return this.body;
    }

}
