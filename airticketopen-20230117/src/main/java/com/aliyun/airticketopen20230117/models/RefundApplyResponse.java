// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundApplyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefundApplyResponseBody body;

    public static RefundApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundApplyResponse self = new RefundApplyResponse();
        return TeaModel.build(map, self);
    }

    public RefundApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundApplyResponse setBody(RefundApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundApplyResponseBody getBody() {
        return this.body;
    }

}
