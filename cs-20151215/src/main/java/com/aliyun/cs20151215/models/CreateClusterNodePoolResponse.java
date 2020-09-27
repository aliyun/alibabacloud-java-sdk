// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateClusterNodePoolResponse setBody(CreateClusterNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterNodePoolResponseBody getBody() {
        return this.body;
    }

}
