// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UninstallKibanaPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UninstallKibanaPluginResponseBody body;

    public static UninstallKibanaPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallKibanaPluginResponse self = new UninstallKibanaPluginResponse();
        return TeaModel.build(map, self);
    }

    public UninstallKibanaPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallKibanaPluginResponse setBody(UninstallKibanaPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallKibanaPluginResponseBody getBody() {
        return this.body;
    }

}
