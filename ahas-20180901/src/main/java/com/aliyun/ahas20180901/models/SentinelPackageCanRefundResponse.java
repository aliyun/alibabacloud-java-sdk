// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelPackageCanRefundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelPackageCanRefundResponseBody body;

    public static SentinelPackageCanRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelPackageCanRefundResponse self = new SentinelPackageCanRefundResponse();
        return TeaModel.build(map, self);
    }

    public SentinelPackageCanRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelPackageCanRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelPackageCanRefundResponse setBody(SentinelPackageCanRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelPackageCanRefundResponseBody getBody() {
        return this.body;
    }

}
