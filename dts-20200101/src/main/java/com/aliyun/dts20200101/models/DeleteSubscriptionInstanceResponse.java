// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteSubscriptionInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DeleteSubscriptionInstanceResponse setBody(DeleteSubscriptionInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubscriptionInstanceResponseBody getBody() {
        return this.body;
    }

}
