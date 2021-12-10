// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseChargeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitInternalPurchaseChargeDataResponseBody body;

    public static SubmitInternalPurchaseChargeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitInternalPurchaseChargeDataResponse self = new SubmitInternalPurchaseChargeDataResponse();
        return TeaModel.build(map, self);
    }

    public SubmitInternalPurchaseChargeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitInternalPurchaseChargeDataResponse setBody(SubmitInternalPurchaseChargeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitInternalPurchaseChargeDataResponseBody getBody() {
        return this.body;
    }

}
