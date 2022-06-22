// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryRecentlyInstalledAhasAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRecentlyInstalledAhasAgentResponseBody body;

    public static QueryRecentlyInstalledAhasAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecentlyInstalledAhasAgentResponse self = new QueryRecentlyInstalledAhasAgentResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecentlyInstalledAhasAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecentlyInstalledAhasAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecentlyInstalledAhasAgentResponse setBody(QueryRecentlyInstalledAhasAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecentlyInstalledAhasAgentResponseBody getBody() {
        return this.body;
    }

}
