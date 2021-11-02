// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetItemPromotionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetItemPromotionResponseBody body;

    public static GetItemPromotionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetItemPromotionResponse self = new GetItemPromotionResponse();
        return TeaModel.build(map, self);
    }

    public GetItemPromotionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetItemPromotionResponse setBody(GetItemPromotionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetItemPromotionResponseBody getBody() {
        return this.body;
    }

}
