// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AssociateResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateResourcesResponseBody body;

    public static AssociateResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateResourcesResponse self = new AssociateResourcesResponse();
        return TeaModel.build(map, self);
    }

    public AssociateResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateResourcesResponse setBody(AssociateResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateResourcesResponseBody getBody() {
        return this.body;
    }

}
