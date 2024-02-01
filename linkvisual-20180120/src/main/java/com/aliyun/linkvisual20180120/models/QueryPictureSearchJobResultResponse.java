// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchJobResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPictureSearchJobResultResponseBody body;

    public static QueryPictureSearchJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchJobResultResponse self = new QueryPictureSearchJobResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPictureSearchJobResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPictureSearchJobResultResponse setBody(QueryPictureSearchJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPictureSearchJobResultResponseBody getBody() {
        return this.body;
    }

}
