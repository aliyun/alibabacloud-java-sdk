// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetPatrolInspectionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPatrolInspectionStatusResponseBody body;

    public static GetPatrolInspectionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolInspectionStatusResponse self = new GetPatrolInspectionStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPatrolInspectionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatrolInspectionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPatrolInspectionStatusResponse setBody(GetPatrolInspectionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatrolInspectionStatusResponseBody getBody() {
        return this.body;
    }

}
