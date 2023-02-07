// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentStatisticsResponseBody body;

    public static GetAgentStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentStatisticsResponse self = new GetAgentStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentStatisticsResponse setBody(GetAgentStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentStatisticsResponseBody getBody() {
        return this.body;
    }

}
