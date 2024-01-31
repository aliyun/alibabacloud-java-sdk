// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureRefundDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsureRefundDetailResponseBody body;

    public static InsureRefundDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        InsureRefundDetailResponse self = new InsureRefundDetailResponse();
        return TeaModel.build(map, self);
    }

    public InsureRefundDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsureRefundDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsureRefundDetailResponse setBody(InsureRefundDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public InsureRefundDetailResponseBody getBody() {
        return this.body;
    }

}
