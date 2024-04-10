// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteInstanceVpcEndpointLinkedVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteInstanceVpcEndpointLinkedVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstanceVpcEndpointLinkedVpcResponse setBody(DeleteInstanceVpcEndpointLinkedVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceVpcEndpointLinkedVpcResponseBody getBody() {
        return this.body;
    }

}
