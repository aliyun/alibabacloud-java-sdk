// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteValidateFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteValidateFileResponseBody body;

    public static DeleteValidateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteValidateFileResponse self = new DeleteValidateFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteValidateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteValidateFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteValidateFileResponse setBody(DeleteValidateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteValidateFileResponseBody getBody() {
        return this.body;
    }

}
