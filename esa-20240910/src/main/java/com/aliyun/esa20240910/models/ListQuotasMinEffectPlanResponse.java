// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListQuotasMinEffectPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQuotasMinEffectPlanResponseBody body;

    public static ListQuotasMinEffectPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasMinEffectPlanResponse self = new ListQuotasMinEffectPlanResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotasMinEffectPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotasMinEffectPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQuotasMinEffectPlanResponse setBody(ListQuotasMinEffectPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotasMinEffectPlanResponseBody getBody() {
        return this.body;
    }

}
