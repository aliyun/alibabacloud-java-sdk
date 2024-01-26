// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AssociateNetworkPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateNetworkPackageResponseBody body;

    public static AssociateNetworkPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkPackageResponse self = new AssociateNetworkPackageResponse();
        return TeaModel.build(map, self);
    }

    public AssociateNetworkPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateNetworkPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateNetworkPackageResponse setBody(AssociateNetworkPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateNetworkPackageResponseBody getBody() {
        return this.body;
    }

}
