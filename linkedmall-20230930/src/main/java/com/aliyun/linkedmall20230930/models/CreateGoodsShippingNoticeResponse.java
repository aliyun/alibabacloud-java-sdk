// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CreateGoodsShippingNoticeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GoodsShippingNoticeCreateResult body;

    public static CreateGoodsShippingNoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGoodsShippingNoticeResponse self = new CreateGoodsShippingNoticeResponse();
        return TeaModel.build(map, self);
    }

    public CreateGoodsShippingNoticeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGoodsShippingNoticeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGoodsShippingNoticeResponse setBody(GoodsShippingNoticeCreateResult body) {
        this.body = body;
        return this;
    }
    public GoodsShippingNoticeCreateResult getBody() {
        return this.body;
    }

}
