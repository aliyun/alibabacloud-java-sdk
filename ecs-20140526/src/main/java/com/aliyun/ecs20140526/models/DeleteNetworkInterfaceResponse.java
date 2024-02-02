// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNetworkInterfaceResponseBody body;

    public static DeleteNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInterfaceResponse self = new DeleteNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkInterfaceResponse setBody(DeleteNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
