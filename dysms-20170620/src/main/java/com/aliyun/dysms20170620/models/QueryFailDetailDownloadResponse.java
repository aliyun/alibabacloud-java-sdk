// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryFailDetailDownloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFailDetailDownloadResponseBody body;

    public static QueryFailDetailDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFailDetailDownloadResponse self = new QueryFailDetailDownloadResponse();
        return TeaModel.build(map, self);
    }

    public QueryFailDetailDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFailDetailDownloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFailDetailDownloadResponse setBody(QueryFailDetailDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFailDetailDownloadResponseBody getBody() {
        return this.body;
    }

}
