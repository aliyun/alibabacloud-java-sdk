// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskPatrolStatisticalTrendsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRiskPatrolStatisticalTrendsResponseBody body;

    public static GetRiskPatrolStatisticalTrendsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskPatrolStatisticalTrendsResponse self = new GetRiskPatrolStatisticalTrendsResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskPatrolStatisticalTrendsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskPatrolStatisticalTrendsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRiskPatrolStatisticalTrendsResponse setBody(GetRiskPatrolStatisticalTrendsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskPatrolStatisticalTrendsResponseBody getBody() {
        return this.body;
    }

}
