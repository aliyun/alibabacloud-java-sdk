// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaListByURLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMediaListByURLResponseBody body;

    public static QueryMediaListByURLResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaListByURLResponse self = new QueryMediaListByURLResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaListByURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaListByURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMediaListByURLResponse setBody(QueryMediaListByURLResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaListByURLResponseBody getBody() {
        return this.body;
    }

}
