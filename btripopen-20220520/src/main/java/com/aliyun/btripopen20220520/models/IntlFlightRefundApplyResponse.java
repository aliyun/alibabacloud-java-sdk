// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightRefundApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightRefundApplyResponseBody body;

    public static IntlFlightRefundApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightRefundApplyResponse self = new IntlFlightRefundApplyResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightRefundApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightRefundApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightRefundApplyResponse setBody(IntlFlightRefundApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightRefundApplyResponseBody getBody() {
        return this.body;
    }

}
