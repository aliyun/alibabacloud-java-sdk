// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DeleteVscResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVscResponseBody body;

    public static DeleteVscResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVscResponse self = new DeleteVscResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVscResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVscResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVscResponse setBody(DeleteVscResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVscResponseBody getBody() {
        return this.body;
    }

}
