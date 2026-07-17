// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserMaxPlanQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserMaxPlanQuotaResponseBody body;

    public static GetUserMaxPlanQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserMaxPlanQuotaResponse self = new GetUserMaxPlanQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetUserMaxPlanQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserMaxPlanQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserMaxPlanQuotaResponse setBody(GetUserMaxPlanQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserMaxPlanQuotaResponseBody getBody() {
        return this.body;
    }

}
