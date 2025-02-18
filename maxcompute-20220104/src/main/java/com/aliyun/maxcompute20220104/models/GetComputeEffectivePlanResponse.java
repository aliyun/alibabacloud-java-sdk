// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetComputeEffectivePlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComputeEffectivePlanResponseBody body;

    public static GetComputeEffectivePlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeEffectivePlanResponse self = new GetComputeEffectivePlanResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeEffectivePlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComputeEffectivePlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComputeEffectivePlanResponse setBody(GetComputeEffectivePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComputeEffectivePlanResponseBody getBody() {
        return this.body;
    }

}
