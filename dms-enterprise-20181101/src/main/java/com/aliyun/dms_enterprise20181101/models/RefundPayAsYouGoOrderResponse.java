// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RefundPayAsYouGoOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundPayAsYouGoOrderResponseBody body;

    public static RefundPayAsYouGoOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundPayAsYouGoOrderResponse self = new RefundPayAsYouGoOrderResponse();
        return TeaModel.build(map, self);
    }

    public RefundPayAsYouGoOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundPayAsYouGoOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundPayAsYouGoOrderResponse setBody(RefundPayAsYouGoOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundPayAsYouGoOrderResponseBody getBody() {
        return this.body;
    }

}
