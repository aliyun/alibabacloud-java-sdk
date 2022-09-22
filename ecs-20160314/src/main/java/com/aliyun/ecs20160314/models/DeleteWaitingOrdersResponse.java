// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteWaitingOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWaitingOrdersResponseBody body;

    public static DeleteWaitingOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaitingOrdersResponse self = new DeleteWaitingOrdersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWaitingOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWaitingOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWaitingOrdersResponse setBody(DeleteWaitingOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWaitingOrdersResponseBody getBody() {
        return this.body;
    }

}
