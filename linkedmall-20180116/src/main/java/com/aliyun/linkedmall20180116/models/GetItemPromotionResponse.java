// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetItemPromotionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetItemPromotionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetItemPromotionResponse setBody(GetItemPromotionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetItemPromotionResponseBody getBody() {
        return this.body;
    }

}
