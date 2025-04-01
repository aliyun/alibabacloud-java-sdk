// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PreviewEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnvironmentDeploymentSpec body;

    public static PreviewEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewEnvironmentResponse self = new PreviewEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public PreviewEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewEnvironmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewEnvironmentResponse setBody(EnvironmentDeploymentSpec body) {
        this.body = body;
        return this;
    }
    public EnvironmentDeploymentSpec getBody() {
        return this.body;
    }

}
