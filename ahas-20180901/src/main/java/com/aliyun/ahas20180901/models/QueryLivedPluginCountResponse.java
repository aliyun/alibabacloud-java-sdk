// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryLivedPluginCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLivedPluginCountResponseBody body;

    public static QueryLivedPluginCountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLivedPluginCountResponse self = new QueryLivedPluginCountResponse();
        return TeaModel.build(map, self);
    }

    public QueryLivedPluginCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLivedPluginCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLivedPluginCountResponse setBody(QueryLivedPluginCountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLivedPluginCountResponseBody getBody() {
        return this.body;
    }

}
