// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsUserTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsUserTagsResponseBody body;

    public static QuerySmsUserTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsUserTagsResponse self = new QuerySmsUserTagsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsUserTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsUserTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsUserTagsResponse setBody(QuerySmsUserTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsUserTagsResponseBody getBody() {
        return this.body;
    }

}
