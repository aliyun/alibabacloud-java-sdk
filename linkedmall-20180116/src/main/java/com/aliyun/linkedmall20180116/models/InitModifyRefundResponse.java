// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class InitModifyRefundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitModifyRefundResponseBody body;

    public static InitModifyRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        InitModifyRefundResponse self = new InitModifyRefundResponse();
        return TeaModel.build(map, self);
    }

    public InitModifyRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitModifyRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitModifyRefundResponse setBody(InitModifyRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public InitModifyRefundResponseBody getBody() {
        return this.body;
    }

}
