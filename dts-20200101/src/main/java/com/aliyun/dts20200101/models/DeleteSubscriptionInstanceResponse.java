// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteSubscriptionInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSubscriptionInstanceResponseBody body;

    public static DeleteSubscriptionInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscriptionInstanceResponse self = new DeleteSubscriptionInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubscriptionInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubscriptionInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSubscriptionInstanceResponse setBody(DeleteSubscriptionInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubscriptionInstanceResponseBody getBody() {
        return this.body;
    }

}
