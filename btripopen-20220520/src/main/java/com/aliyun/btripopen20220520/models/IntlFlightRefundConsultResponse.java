// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightRefundConsultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightRefundConsultResponseBody body;

    public static IntlFlightRefundConsultResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightRefundConsultResponse self = new IntlFlightRefundConsultResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightRefundConsultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightRefundConsultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightRefundConsultResponse setBody(IntlFlightRefundConsultResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightRefundConsultResponseBody getBody() {
        return this.body;
    }

}
