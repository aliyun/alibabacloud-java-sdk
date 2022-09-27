// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetSubscriptionItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSubscriptionItemResponseBody body;

    public static GetSubscriptionItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionItemResponse self = new GetSubscriptionItemResponse();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubscriptionItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubscriptionItemResponse setBody(GetSubscriptionItemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubscriptionItemResponseBody getBody() {
        return this.body;
    }

}
