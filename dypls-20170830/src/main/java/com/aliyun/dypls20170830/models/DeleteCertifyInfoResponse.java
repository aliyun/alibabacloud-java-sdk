// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class DeleteCertifyInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCertifyInfoResponseBody body;

    public static DeleteCertifyInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertifyInfoResponse self = new DeleteCertifyInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCertifyInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCertifyInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCertifyInfoResponse setBody(DeleteCertifyInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCertifyInfoResponseBody getBody() {
        return this.body;
    }

}
