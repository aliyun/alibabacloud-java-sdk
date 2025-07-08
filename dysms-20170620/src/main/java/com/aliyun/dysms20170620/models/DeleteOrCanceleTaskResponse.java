// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteOrCanceleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOrCanceleTaskResponseBody body;

    public static DeleteOrCanceleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOrCanceleTaskResponse self = new DeleteOrCanceleTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOrCanceleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOrCanceleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOrCanceleTaskResponse setBody(DeleteOrCanceleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOrCanceleTaskResponseBody getBody() {
        return this.body;
    }

}
