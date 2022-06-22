// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryRecentlyInstalledJavaAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRecentlyInstalledJavaAgentResponseBody body;

    public static QueryRecentlyInstalledJavaAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecentlyInstalledJavaAgentResponse self = new QueryRecentlyInstalledJavaAgentResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecentlyInstalledJavaAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecentlyInstalledJavaAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecentlyInstalledJavaAgentResponse setBody(QueryRecentlyInstalledJavaAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecentlyInstalledJavaAgentResponseBody getBody() {
        return this.body;
    }

}
