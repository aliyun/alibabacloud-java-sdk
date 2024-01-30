// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RollbackChangeOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackChangeOrderResponseBody body;

    public static RollbackChangeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackChangeOrderResponse self = new RollbackChangeOrderResponse();
        return TeaModel.build(map, self);
    }

    public RollbackChangeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackChangeOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackChangeOrderResponse setBody(RollbackChangeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackChangeOrderResponseBody getBody() {
        return this.body;
    }

}
