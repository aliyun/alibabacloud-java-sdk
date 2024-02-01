// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPictureSearchJobResponseBody body;

    public static QueryPictureSearchJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchJobResponse self = new QueryPictureSearchJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPictureSearchJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPictureSearchJobResponse setBody(QueryPictureSearchJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPictureSearchJobResponseBody getBody() {
        return this.body;
    }

}
