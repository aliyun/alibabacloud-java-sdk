// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryFailDetailDownloadNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFailDetailDownloadNewResponseBody body;

    public static QueryFailDetailDownloadNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFailDetailDownloadNewResponse self = new QueryFailDetailDownloadNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryFailDetailDownloadNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFailDetailDownloadNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFailDetailDownloadNewResponse setBody(QueryFailDetailDownloadNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFailDetailDownloadNewResponseBody getBody() {
        return this.body;
    }

}
