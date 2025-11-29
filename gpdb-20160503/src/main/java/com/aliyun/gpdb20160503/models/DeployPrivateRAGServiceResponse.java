// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeployPrivateRAGServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeployPrivateRAGServiceResponseBody body;

    public static DeployPrivateRAGServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployPrivateRAGServiceResponse self = new DeployPrivateRAGServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeployPrivateRAGServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployPrivateRAGServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployPrivateRAGServiceResponse setBody(DeployPrivateRAGServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployPrivateRAGServiceResponseBody getBody() {
        return this.body;
    }

}
