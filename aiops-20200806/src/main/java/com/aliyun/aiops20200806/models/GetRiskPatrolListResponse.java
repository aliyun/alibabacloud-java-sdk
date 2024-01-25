// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskPatrolListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRiskPatrolListResponseBody body;

    public static GetRiskPatrolListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskPatrolListResponse self = new GetRiskPatrolListResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskPatrolListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskPatrolListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRiskPatrolListResponse setBody(GetRiskPatrolListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskPatrolListResponseBody getBody() {
        return this.body;
    }

}
