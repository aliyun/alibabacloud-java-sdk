// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAhasAgentPluginInstallScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAhasAgentPluginInstallScriptResponseBody body;

    public static QueryAhasAgentPluginInstallScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAhasAgentPluginInstallScriptResponse self = new QueryAhasAgentPluginInstallScriptResponse();
        return TeaModel.build(map, self);
    }

    public QueryAhasAgentPluginInstallScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAhasAgentPluginInstallScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAhasAgentPluginInstallScriptResponse setBody(QueryAhasAgentPluginInstallScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAhasAgentPluginInstallScriptResponseBody getBody() {
        return this.body;
    }

}
