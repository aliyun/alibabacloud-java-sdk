// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNetworkResponseBody body;

    public static DeleteNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkResponse self = new DeleteNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkResponse setBody(DeleteNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkResponseBody getBody() {
        return this.body;
    }

}
