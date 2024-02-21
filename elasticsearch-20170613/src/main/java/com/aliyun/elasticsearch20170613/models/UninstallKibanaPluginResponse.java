// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UninstallKibanaPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UninstallKibanaPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallKibanaPluginResponse setBody(UninstallKibanaPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallKibanaPluginResponseBody getBody() {
        return this.body;
    }

}
