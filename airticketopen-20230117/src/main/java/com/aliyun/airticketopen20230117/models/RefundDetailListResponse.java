// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundDetailListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefundDetailListResponseBody body;

    public static RefundDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundDetailListResponse self = new RefundDetailListResponse();
        return TeaModel.build(map, self);
    }

    public RefundDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundDetailListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundDetailListResponse setBody(RefundDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundDetailListResponseBody getBody() {
        return this.body;
    }

}
