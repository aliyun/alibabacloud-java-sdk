// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteInstanceVpcEndpointLinkedVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstanceVpcEndpointLinkedVpcResponseBody body;

    public static DeleteInstanceVpcEndpointLinkedVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceVpcEndpointLinkedVpcResponse self = new DeleteInstanceVpcEndpointLinkedVpcResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceVpcEndpointLinkedVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceVpcEndpointLinkedVpcResponse setBody(DeleteInstanceVpcEndpointLinkedVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceVpcEndpointLinkedVpcResponseBody getBody() {
        return this.body;
    }

}
