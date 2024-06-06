// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetEmissionSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEmissionSummaryResponseBody body;

    public static GetEmissionSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmissionSummaryResponse self = new GetEmissionSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetEmissionSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEmissionSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEmissionSummaryResponse setBody(GetEmissionSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmissionSummaryResponseBody getBody() {
        return this.body;
    }

}
