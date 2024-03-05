// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class UpdatePartnerReservePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePartnerReservePriceResponseBody body;

    public static UpdatePartnerReservePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePartnerReservePriceResponse self = new UpdatePartnerReservePriceResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePartnerReservePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePartnerReservePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePartnerReservePriceResponse setBody(UpdatePartnerReservePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePartnerReservePriceResponseBody getBody() {
        return this.body;
    }

}
