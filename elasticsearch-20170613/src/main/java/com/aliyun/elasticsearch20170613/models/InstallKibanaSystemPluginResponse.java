// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallKibanaSystemPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InstallKibanaSystemPluginResponseBody body;

    public static InstallKibanaSystemPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallKibanaSystemPluginResponse self = new InstallKibanaSystemPluginResponse();
        return TeaModel.build(map, self);
    }

    public InstallKibanaSystemPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallKibanaSystemPluginResponse setBody(InstallKibanaSystemPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallKibanaSystemPluginResponseBody getBody() {
        return this.body;
    }

}
