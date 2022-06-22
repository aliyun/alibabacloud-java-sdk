// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAhasAgentPluginEnabledResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAhasAgentPluginEnabledResponseBody body;

    public static QueryAhasAgentPluginEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAhasAgentPluginEnabledResponse self = new QueryAhasAgentPluginEnabledResponse();
        return TeaModel.build(map, self);
    }

    public QueryAhasAgentPluginEnabledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAhasAgentPluginEnabledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAhasAgentPluginEnabledResponse setBody(QueryAhasAgentPluginEnabledResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAhasAgentPluginEnabledResponseBody getBody() {
        return this.body;
    }

}
