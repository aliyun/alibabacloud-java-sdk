// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DeleteChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteChaincodeResponseBody body;

    public static DeleteChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChaincodeResponse self = new DeleteChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChaincodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteChaincodeResponse setBody(DeleteChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChaincodeResponseBody getBody() {
        return this.body;
    }

}
