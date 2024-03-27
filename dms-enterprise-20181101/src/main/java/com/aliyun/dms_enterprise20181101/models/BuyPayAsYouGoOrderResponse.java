// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BuyPayAsYouGoOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BuyPayAsYouGoOrderResponseBody body;

    public static BuyPayAsYouGoOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        BuyPayAsYouGoOrderResponse self = new BuyPayAsYouGoOrderResponse();
        return TeaModel.build(map, self);
    }

    public BuyPayAsYouGoOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BuyPayAsYouGoOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BuyPayAsYouGoOrderResponse setBody(BuyPayAsYouGoOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public BuyPayAsYouGoOrderResponseBody getBody() {
        return this.body;
    }

}
