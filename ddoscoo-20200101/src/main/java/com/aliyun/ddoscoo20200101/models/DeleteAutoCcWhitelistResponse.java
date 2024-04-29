// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAutoCcWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAutoCcWhitelistResponseBody body;

    public static DeleteAutoCcWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoCcWhitelistResponse self = new DeleteAutoCcWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoCcWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutoCcWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAutoCcWhitelistResponse setBody(DeleteAutoCcWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutoCcWhitelistResponseBody getBody() {
        return this.body;
    }

}
