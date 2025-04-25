// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetSavingPlanDeductableCommodityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSavingPlanDeductableCommodityResponseBody body;

    public static GetSavingPlanDeductableCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSavingPlanDeductableCommodityResponse self = new GetSavingPlanDeductableCommodityResponse();
        return TeaModel.build(map, self);
    }

    public GetSavingPlanDeductableCommodityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSavingPlanDeductableCommodityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSavingPlanDeductableCommodityResponse setBody(GetSavingPlanDeductableCommodityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSavingPlanDeductableCommodityResponseBody getBody() {
        return this.body;
    }

}
