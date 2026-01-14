// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DisassociateResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociateResourcesResponseBody body;

    public static DisassociateResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateResourcesResponse self = new DisassociateResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateResourcesResponse setBody(DisassociateResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateResourcesResponseBody getBody() {
        return this.body;
    }

}
