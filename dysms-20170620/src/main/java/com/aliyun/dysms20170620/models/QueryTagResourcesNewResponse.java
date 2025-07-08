// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryTagResourcesNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTagResourcesNewResponseBody body;

    public static QueryTagResourcesNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTagResourcesNewResponse self = new QueryTagResourcesNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryTagResourcesNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTagResourcesNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTagResourcesNewResponse setBody(QueryTagResourcesNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTagResourcesNewResponseBody getBody() {
        return this.body;
    }

}
