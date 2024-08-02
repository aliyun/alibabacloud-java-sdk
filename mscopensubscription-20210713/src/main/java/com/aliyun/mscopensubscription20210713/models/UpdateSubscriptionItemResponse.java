// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSubscriptionItemResponseBody body;

    public static UpdateSubscriptionItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionItemResponse self = new UpdateSubscriptionItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSubscriptionItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSubscriptionItemResponse setBody(UpdateSubscriptionItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSubscriptionItemResponseBody getBody() {
        return this.body;
    }

}
