// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateClusterNodePoolResponseBody body;

    public static CreateClusterNodePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterNodePoolResponse self = new CreateClusterNodePoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterNodePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterNodePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClusterNodePoolResponse setBody(CreateClusterNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterNodePoolResponseBody getBody() {
        return this.body;
    }

}
