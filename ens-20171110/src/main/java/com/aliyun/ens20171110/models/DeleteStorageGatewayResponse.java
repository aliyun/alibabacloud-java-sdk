// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteStorageGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStorageGatewayResponseBody body;

    public static DeleteStorageGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageGatewayResponse self = new DeleteStorageGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStorageGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStorageGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStorageGatewayResponse setBody(DeleteStorageGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStorageGatewayResponseBody getBody() {
        return this.body;
    }

}
