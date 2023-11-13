// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallEnvironmentFeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InstallEnvironmentFeatureResponseBody body;

    public static InstallEnvironmentFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallEnvironmentFeatureResponse self = new InstallEnvironmentFeatureResponse();
        return TeaModel.build(map, self);
    }

    public InstallEnvironmentFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallEnvironmentFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallEnvironmentFeatureResponse setBody(InstallEnvironmentFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallEnvironmentFeatureResponseBody getBody() {
        return this.body;
    }

}
