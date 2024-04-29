// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAutoCcBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAutoCcBlacklistResponseBody body;

    public static DeleteAutoCcBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoCcBlacklistResponse self = new DeleteAutoCcBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoCcBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutoCcBlacklistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAutoCcBlacklistResponse setBody(DeleteAutoCcBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutoCcBlacklistResponseBody getBody() {
        return this.body;
    }

}
