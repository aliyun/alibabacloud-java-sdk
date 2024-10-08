// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserLogDeliveryQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserLogDeliveryQuotaResponseBody body;

    public static GetUserLogDeliveryQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserLogDeliveryQuotaResponse self = new GetUserLogDeliveryQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetUserLogDeliveryQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserLogDeliveryQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserLogDeliveryQuotaResponse setBody(GetUserLogDeliveryQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserLogDeliveryQuotaResponseBody getBody() {
        return this.body;
    }

}
