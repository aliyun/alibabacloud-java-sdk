// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetSubscriptionDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSubscriptionDetailResponseBody body;

    public static GetSubscriptionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionDetailResponse self = new GetSubscriptionDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubscriptionDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubscriptionDetailResponse setBody(GetSubscriptionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubscriptionDetailResponseBody getBody() {
        return this.body;
    }

}
