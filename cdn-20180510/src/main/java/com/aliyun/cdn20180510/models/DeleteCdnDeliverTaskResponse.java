// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCdnDeliverTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCdnDeliverTaskResponseBody body;

    public static DeleteCdnDeliverTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCdnDeliverTaskResponse self = new DeleteCdnDeliverTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCdnDeliverTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCdnDeliverTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCdnDeliverTaskResponse setBody(DeleteCdnDeliverTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCdnDeliverTaskResponseBody getBody() {
        return this.body;
    }

}
