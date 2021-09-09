// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallLogstashSystemPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InstallLogstashSystemPluginResponseBody body;

    public static InstallLogstashSystemPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallLogstashSystemPluginResponse self = new InstallLogstashSystemPluginResponse();
        return TeaModel.build(map, self);
    }

    public InstallLogstashSystemPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallLogstashSystemPluginResponse setBody(InstallLogstashSystemPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallLogstashSystemPluginResponseBody getBody() {
        return this.body;
    }

}
