// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDeploymentPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeploymentPackageResponseBody body;

    public static GetDeploymentPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentPackageResponse self = new GetDeploymentPackageResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeploymentPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeploymentPackageResponse setBody(GetDeploymentPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeploymentPackageResponseBody getBody() {
        return this.body;
    }

}
