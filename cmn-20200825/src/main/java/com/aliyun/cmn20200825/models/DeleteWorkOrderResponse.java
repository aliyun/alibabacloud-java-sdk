// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteWorkOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWorkOrderResponseBody body;

    public static DeleteWorkOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkOrderResponse self = new DeleteWorkOrderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkOrderResponse setBody(DeleteWorkOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkOrderResponseBody getBody() {
        return this.body;
    }

}
