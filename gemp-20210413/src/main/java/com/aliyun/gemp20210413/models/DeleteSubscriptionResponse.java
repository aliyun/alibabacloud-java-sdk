// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSubscriptionResponseBody body;

    public static DeleteSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscriptionResponse self = new DeleteSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSubscriptionResponse setBody(DeleteSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubscriptionResponseBody getBody() {
        return this.body;
    }

}
