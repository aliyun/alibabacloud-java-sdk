// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ApplyRefundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyRefundResponseBody body;

    public static ApplyRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefundResponse self = new ApplyRefundResponse();
        return TeaModel.build(map, self);
    }

    public ApplyRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyRefundResponse setBody(ApplyRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyRefundResponseBody getBody() {
        return this.body;
    }

}
