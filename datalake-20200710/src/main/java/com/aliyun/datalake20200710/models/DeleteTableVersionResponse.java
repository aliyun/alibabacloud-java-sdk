// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteTableVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTableVersionResponseBody body;

    public static DeleteTableVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableVersionResponse self = new DeleteTableVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTableVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTableVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTableVersionResponse setBody(DeleteTableVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTableVersionResponseBody getBody() {
        return this.body;
    }

}
