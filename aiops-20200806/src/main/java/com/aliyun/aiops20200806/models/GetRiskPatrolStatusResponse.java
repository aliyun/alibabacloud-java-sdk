// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskPatrolStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRiskPatrolStatusResponseBody body;

    public static GetRiskPatrolStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskPatrolStatusResponse self = new GetRiskPatrolStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskPatrolStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskPatrolStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRiskPatrolStatusResponse setBody(GetRiskPatrolStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskPatrolStatusResponseBody getBody() {
        return this.body;
    }

}
