// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryCopyrightJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCopyrightJobResponseBody body;

    public static QueryCopyrightJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightJobResponse self = new QueryCopyrightJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCopyrightJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCopyrightJobResponse setBody(QueryCopyrightJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCopyrightJobResponseBody getBody() {
        return this.body;
    }

}
