// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DeleteSubscriptionInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
