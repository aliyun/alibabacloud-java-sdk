// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskPatrolStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRiskPatrolStatisticsResponseBody body;

    public static GetRiskPatrolStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskPatrolStatisticsResponse self = new GetRiskPatrolStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskPatrolStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskPatrolStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRiskPatrolStatisticsResponse setBody(GetRiskPatrolStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskPatrolStatisticsResponseBody getBody() {
        return this.body;
    }

}
