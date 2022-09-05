// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class DeleteCreativeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCreativeInfoResponseBody body;

    public static DeleteCreativeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCreativeInfoResponse self = new DeleteCreativeInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCreativeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCreativeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCreativeInfoResponse setBody(DeleteCreativeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCreativeInfoResponseBody getBody() {
        return this.body;
    }

}
