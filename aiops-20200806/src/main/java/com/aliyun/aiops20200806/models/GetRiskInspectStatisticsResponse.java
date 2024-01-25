// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskInspectStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRiskInspectStatisticsResponseBody body;

    public static GetRiskInspectStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskInspectStatisticsResponse self = new GetRiskInspectStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskInspectStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskInspectStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRiskInspectStatisticsResponse setBody(GetRiskInspectStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskInspectStatisticsResponseBody getBody() {
        return this.body;
    }

}
