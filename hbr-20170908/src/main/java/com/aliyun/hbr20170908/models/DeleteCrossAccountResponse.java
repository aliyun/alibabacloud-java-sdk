// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteCrossAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCrossAccountResponseBody body;

    public static DeleteCrossAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCrossAccountResponse self = new DeleteCrossAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCrossAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCrossAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCrossAccountResponse setBody(DeleteCrossAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCrossAccountResponseBody getBody() {
        return this.body;
    }

}
