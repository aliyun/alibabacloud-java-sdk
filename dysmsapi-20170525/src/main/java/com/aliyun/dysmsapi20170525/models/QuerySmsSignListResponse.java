// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsSignListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsSignListResponseBody body;

    public static QuerySmsSignListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignListResponse self = new QuerySmsSignListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsSignListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsSignListResponse setBody(QuerySmsSignListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsSignListResponseBody getBody() {
        return this.body;
    }

}
