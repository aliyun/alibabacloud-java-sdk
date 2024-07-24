// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class DeleteDictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDictResponseBody body;

    public static DeleteDictResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDictResponse self = new DeleteDictResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDictResponse setBody(DeleteDictResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDictResponseBody getBody() {
        return this.body;
    }

}
