// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsUserTagsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsUserTagsNewResponseBody body;

    public static QuerySmsUserTagsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsUserTagsNewResponse self = new QuerySmsUserTagsNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsUserTagsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsUserTagsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsUserTagsNewResponse setBody(QuerySmsUserTagsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsUserTagsNewResponseBody getBody() {
        return this.body;
    }

}
