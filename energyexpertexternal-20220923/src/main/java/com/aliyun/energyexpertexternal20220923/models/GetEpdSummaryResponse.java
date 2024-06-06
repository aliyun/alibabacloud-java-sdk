// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetEpdSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEpdSummaryResponseBody body;

    public static GetEpdSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEpdSummaryResponse self = new GetEpdSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetEpdSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEpdSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEpdSummaryResponse setBody(GetEpdSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEpdSummaryResponseBody getBody() {
        return this.body;
    }

}
