// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnKvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDcdnKvResponseBody body;

    public static DeleteDcdnKvResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnKvResponse self = new DeleteDcdnKvResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnKvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnKvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnKvResponse setBody(DeleteDcdnKvResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnKvResponseBody getBody() {
        return this.body;
    }

}
