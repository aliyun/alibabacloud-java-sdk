// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryWaitInstallPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryWaitInstallPluginResponseBody body;

    public static QueryWaitInstallPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWaitInstallPluginResponse self = new QueryWaitInstallPluginResponse();
        return TeaModel.build(map, self);
    }

    public QueryWaitInstallPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWaitInstallPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWaitInstallPluginResponse setBody(QueryWaitInstallPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWaitInstallPluginResponseBody getBody() {
        return this.body;
    }

}
