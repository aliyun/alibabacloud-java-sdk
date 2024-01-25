// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetPatrolInspectionDetailThrendDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPatrolInspectionDetailThrendDataResponseBody body;

    public static GetPatrolInspectionDetailThrendDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolInspectionDetailThrendDataResponse self = new GetPatrolInspectionDetailThrendDataResponse();
        return TeaModel.build(map, self);
    }

    public GetPatrolInspectionDetailThrendDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatrolInspectionDetailThrendDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPatrolInspectionDetailThrendDataResponse setBody(GetPatrolInspectionDetailThrendDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatrolInspectionDetailThrendDataResponseBody getBody() {
        return this.body;
    }

}
