// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ContinueDeployServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ContinueDeployServiceInstanceResponseBody body;

    public static ContinueDeployServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinueDeployServiceInstanceResponse self = new ContinueDeployServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ContinueDeployServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContinueDeployServiceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContinueDeployServiceInstanceResponse setBody(ContinueDeployServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinueDeployServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
