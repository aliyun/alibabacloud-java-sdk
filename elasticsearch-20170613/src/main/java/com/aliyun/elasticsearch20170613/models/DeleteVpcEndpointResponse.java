// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteVpcEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteVpcEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpcEndpointResponse setBody(DeleteVpcEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcEndpointResponseBody getBody() {
        return this.body;
    }

}
