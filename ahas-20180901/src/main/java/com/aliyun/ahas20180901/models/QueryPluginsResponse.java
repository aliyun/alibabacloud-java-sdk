// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryPluginsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPluginsResponseBody body;

    public static QueryPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPluginsResponse self = new QueryPluginsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPluginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPluginsResponse setBody(QueryPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPluginsResponseBody getBody() {
        return this.body;
    }

}
