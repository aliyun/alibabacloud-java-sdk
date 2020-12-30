// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class QueryTableDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTableDataResponseBody body;

    public static QueryTableDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTableDataResponse self = new QueryTableDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryTableDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTableDataResponse setBody(QueryTableDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTableDataResponseBody getBody() {
        return this.body;
    }

}
