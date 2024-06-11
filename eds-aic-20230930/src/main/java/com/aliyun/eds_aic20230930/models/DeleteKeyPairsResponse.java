// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteKeyPairsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKeyPairsResponseBody body;

    public static DeleteKeyPairsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyPairsResponse self = new DeleteKeyPairsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKeyPairsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKeyPairsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKeyPairsResponse setBody(DeleteKeyPairsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKeyPairsResponseBody getBody() {
        return this.body;
    }

}
