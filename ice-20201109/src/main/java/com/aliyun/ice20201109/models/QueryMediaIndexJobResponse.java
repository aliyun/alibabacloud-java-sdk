// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryMediaIndexJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMediaIndexJobResponseBody body;

    public static QueryMediaIndexJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaIndexJobResponse self = new QueryMediaIndexJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaIndexJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaIndexJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMediaIndexJobResponse setBody(QueryMediaIndexJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaIndexJobResponseBody getBody() {
        return this.body;
    }

}
