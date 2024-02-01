// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPictureSearchAppsResponseBody body;

    public static QueryPictureSearchAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchAppsResponse self = new QueryPictureSearchAppsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPictureSearchAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPictureSearchAppsResponse setBody(QueryPictureSearchAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPictureSearchAppsResponseBody getBody() {
        return this.body;
    }

}
