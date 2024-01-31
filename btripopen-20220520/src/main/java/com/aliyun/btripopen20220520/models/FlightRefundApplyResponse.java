// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightRefundApplyResponseBody body;

    public static FlightRefundApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundApplyResponse self = new FlightRefundApplyResponse();
        return TeaModel.build(map, self);
    }

    public FlightRefundApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightRefundApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightRefundApplyResponse setBody(FlightRefundApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightRefundApplyResponseBody getBody() {
        return this.body;
    }

}
