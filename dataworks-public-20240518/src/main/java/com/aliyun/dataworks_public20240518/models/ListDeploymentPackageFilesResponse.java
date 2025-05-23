// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDeploymentPackageFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeploymentPackageFilesResponseBody body;

    public static ListDeploymentPackageFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentPackageFilesResponse self = new ListDeploymentPackageFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListDeploymentPackageFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeploymentPackageFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeploymentPackageFilesResponse setBody(ListDeploymentPackageFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeploymentPackageFilesResponseBody getBody() {
        return this.body;
    }

}
