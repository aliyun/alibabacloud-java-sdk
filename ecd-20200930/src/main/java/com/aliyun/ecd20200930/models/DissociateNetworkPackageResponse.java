// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DissociateNetworkPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DissociateNetworkPackageResponseBody body;

    public static DissociateNetworkPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateNetworkPackageResponse self = new DissociateNetworkPackageResponse();
        return TeaModel.build(map, self);
    }

    public DissociateNetworkPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateNetworkPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateNetworkPackageResponse setBody(DissociateNetworkPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateNetworkPackageResponseBody getBody() {
        return this.body;
    }

}
