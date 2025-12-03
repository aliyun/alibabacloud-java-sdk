// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetOrderSummaryForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrderSummaryForPartnerResponseBody body;

    public static GetOrderSummaryForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderSummaryForPartnerResponse self = new GetOrderSummaryForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderSummaryForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrderSummaryForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrderSummaryForPartnerResponse setBody(GetOrderSummaryForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrderSummaryForPartnerResponseBody getBody() {
        return this.body;
    }

}
