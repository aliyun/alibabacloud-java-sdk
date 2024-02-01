// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchAiboxesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPictureSearchAiboxesResponseBody body;

    public static QueryPictureSearchAiboxesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchAiboxesResponse self = new QueryPictureSearchAiboxesResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchAiboxesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPictureSearchAiboxesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPictureSearchAiboxesResponse setBody(QueryPictureSearchAiboxesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPictureSearchAiboxesResponseBody getBody() {
        return this.body;
    }

}
