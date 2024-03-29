// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class QuerySmsUpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsUpsResponseBody body;

    public static QuerySmsUpsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsUpsResponse self = new QuerySmsUpsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsUpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsUpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsUpsResponse setBody(QuerySmsUpsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsUpsResponseBody getBody() {
        return this.body;
    }

}
