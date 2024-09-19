// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AbolishDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbolishDeploymentResponseBody body;

    public static AbolishDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        AbolishDeploymentResponse self = new AbolishDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public AbolishDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbolishDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbolishDeploymentResponse setBody(AbolishDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public AbolishDeploymentResponseBody getBody() {
        return this.body;
    }

}
