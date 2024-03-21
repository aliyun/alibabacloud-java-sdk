// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnDeliverTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDcdnDeliverTaskResponseBody body;

    public static DeleteDcdnDeliverTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnDeliverTaskResponse self = new DeleteDcdnDeliverTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnDeliverTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnDeliverTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnDeliverTaskResponse setBody(DeleteDcdnDeliverTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnDeliverTaskResponseBody getBody() {
        return this.body;
    }

}
