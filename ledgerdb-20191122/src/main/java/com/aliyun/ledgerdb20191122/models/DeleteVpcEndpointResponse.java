// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DeleteVpcEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVpcEndpointResponseBody body;

    public static DeleteVpcEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcEndpointResponse self = new DeleteVpcEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpcEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpcEndpointResponse setBody(DeleteVpcEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcEndpointResponseBody getBody() {
        return this.body;
    }

}
