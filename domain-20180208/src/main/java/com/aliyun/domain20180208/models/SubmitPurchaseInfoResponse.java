// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class SubmitPurchaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitPurchaseInfoResponseBody body;

    public static SubmitPurchaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPurchaseInfoResponse self = new SubmitPurchaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPurchaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitPurchaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitPurchaseInfoResponse setBody(SubmitPurchaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPurchaseInfoResponseBody getBody() {
        return this.body;
    }

}
