// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteLogDeliveryQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSiteLogDeliveryQuotaResponseBody body;

    public static GetSiteLogDeliveryQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSiteLogDeliveryQuotaResponse self = new GetSiteLogDeliveryQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetSiteLogDeliveryQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSiteLogDeliveryQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSiteLogDeliveryQuotaResponse setBody(GetSiteLogDeliveryQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSiteLogDeliveryQuotaResponseBody getBody() {
        return this.body;
    }

}
