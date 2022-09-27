// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetSubscriptionItemDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSubscriptionItemDetailResponseBody body;

    public static GetSubscriptionItemDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionItemDetailResponse self = new GetSubscriptionItemDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionItemDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubscriptionItemDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubscriptionItemDetailResponse setBody(GetSubscriptionItemDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubscriptionItemDetailResponseBody getBody() {
        return this.body;
    }

}
