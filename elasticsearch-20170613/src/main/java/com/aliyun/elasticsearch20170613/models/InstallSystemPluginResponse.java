// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallSystemPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InstallSystemPluginResponseBody body;

    public static InstallSystemPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallSystemPluginResponse self = new InstallSystemPluginResponse();
        return TeaModel.build(map, self);
    }

    public InstallSystemPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallSystemPluginResponse setBody(InstallSystemPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallSystemPluginResponseBody getBody() {
        return this.body;
    }

}
