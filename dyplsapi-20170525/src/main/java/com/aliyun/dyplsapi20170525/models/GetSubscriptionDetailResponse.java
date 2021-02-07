// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetSubscriptionDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public GetSubscriptionDetailResponse setBody(GetSubscriptionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubscriptionDetailResponseBody getBody() {
        return this.body;
    }

}
