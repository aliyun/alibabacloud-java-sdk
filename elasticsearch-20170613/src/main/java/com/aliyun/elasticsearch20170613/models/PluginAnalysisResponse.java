// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class PluginAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PluginAnalysisResponseBody body;

    public static PluginAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        PluginAnalysisResponse self = new PluginAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public PluginAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PluginAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PluginAnalysisResponse setBody(PluginAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public PluginAnalysisResponseBody getBody() {
        return this.body;
    }

}
