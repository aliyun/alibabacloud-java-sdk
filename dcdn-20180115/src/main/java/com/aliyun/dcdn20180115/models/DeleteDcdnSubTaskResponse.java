// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnSubTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDcdnSubTaskResponseBody body;

    public static DeleteDcdnSubTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnSubTaskResponse self = new DeleteDcdnSubTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnSubTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnSubTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnSubTaskResponse setBody(DeleteDcdnSubTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnSubTaskResponseBody getBody() {
        return this.body;
    }

}
