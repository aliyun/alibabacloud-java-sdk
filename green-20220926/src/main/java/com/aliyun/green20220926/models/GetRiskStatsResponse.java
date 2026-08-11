// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetRiskStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRiskStatsResponseBody body;

    public static GetRiskStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskStatsResponse self = new GetRiskStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRiskStatsResponse setBody(GetRiskStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskStatsResponseBody getBody() {
        return this.body;
    }

}
