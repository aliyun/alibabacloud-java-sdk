// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkInterfacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNetworkInterfacesResponseBody body;

    public static DeleteNetworkInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInterfacesResponse self = new DeleteNetworkInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInterfacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkInterfacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkInterfacesResponse setBody(DeleteNetworkInterfacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkInterfacesResponseBody getBody() {
        return this.body;
    }

}
